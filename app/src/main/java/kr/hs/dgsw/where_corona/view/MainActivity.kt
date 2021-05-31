package kr.hs.dgsw.where_corona.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kr.hs.dgsw.where_corona.R
import kr.hs.dgsw.where_corona.data.retrofit_builder.RetrofitBuilder
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val d = CompositeDisposable()
        d.add(
        RetrofitBuilder.api.getCoronaInfo("NRIrT3EzAtL4Oc7QkYmDuH58M2JPn6xBy")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({
                    Log.d("TEST", "Success")
                },{
                    Log.d("TEST", "${it.message}")
                    Log.d("TEST", "Fail")
                }))
    }
}