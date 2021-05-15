package kr.hs.dgsw.where_corona.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kr.hs.dgsw.where_corona.R
import kr.hs.dgsw.where_corona.Fragment.WhereImageDialogFragment
import kr.hs.dgsw.where_corona.databinding.ActivityHomeBinding
import kotlin.system.measureTimeMillis

class HomeActivity : AppCompatActivity() {

    var backKeyPressedTime : Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityHomeBinding>(this, R.layout.activity_home)
        binding.lifecycleOwner = this

        binding.btnWhereImage.setOnClickListener {
            val whereImageDialog = WhereImageDialogFragment()

            whereImageDialog.show(supportFragmentManager, whereImageDialog.tag)
        }

        binding.btnCityStatus.setOnClickListener {
            startActivity(Intent(this, CityStatusActivity::class.java))
        }
        binding.btnTodayStatus.setOnClickListener {
            startActivity(Intent(this, TodayStatusActivity::class.java))
        }
        binding.btnKoreaStatus.setOnClickListener {
            startActivity(Intent(this, KoreaStatusActivity::class.java))
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()

        if (System.currentTimeMillis() > backKeyPressedTime + 2000) {
            backKeyPressedTime = System.currentTimeMillis();
            Toast.makeText(this, "\'뒤로\' 버튼을 한번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT).show();
            return;
        }

        if (System.currentTimeMillis() <= backKeyPressedTime + 2000) {
            finish()
        }
    }
}