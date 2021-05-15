package kr.hs.dgsw.where_corona.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.hs.dgsw.where_corona.R

class KoreaStatusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korea_status)
    }

    override fun onBackPressed() {
        super.onBackPressed()

        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}