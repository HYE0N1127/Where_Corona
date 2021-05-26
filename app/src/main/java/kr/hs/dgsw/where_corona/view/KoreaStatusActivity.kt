package kr.hs.dgsw.where_corona.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kr.hs.dgsw.where_corona.R
import kr.hs.dgsw.where_corona.data.model.response_model.CoronaInfo
import kr.hs.dgsw.where_corona.data.retrofit_builder.RetrofitBuilder
import javax.security.auth.callback.Callback

class KoreaStatusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korea_status)

        val call = RetrofitBuilder.api.getCoronaInfo("dfdfs312dsd")     // 현재 들어간 서비스키의 값은 임의로 넣어놓은 제대로 된 서비스 키의 값이 아닙니다.


    }

    override fun onBackPressed() {
        super.onBackPressed()

        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}

