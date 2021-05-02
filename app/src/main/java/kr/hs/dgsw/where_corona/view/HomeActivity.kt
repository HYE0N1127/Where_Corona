package kr.hs.dgsw.where_corona.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.hs.dgsw.where_corona.R
import kr.hs.dgsw.where_corona.Fragment.WhereImageDialogFragment
import kr.hs.dgsw.where_corona.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
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
}