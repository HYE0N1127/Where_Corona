package kr.hs.dgsw.where_corona.viewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import io.reactivex.Completable
import io.reactivex.observers.DisposableCompletableObserver
import kr.hs.dgsw.where_corona.R
import kr.hs.dgsw.where_corona.adapter.PrecautionAdapter
import kr.hs.dgsw.where_corona.base.viewmodel.BaseViewModel

class HomeViewModel : BaseViewModel() {
    val onWhereImageEvent = MutableLiveData<Unit>()
    val onTodayRecordEvent = MutableLiveData<Unit>()
    val onKoreaRecordEvent = MutableLiveData<Unit>()
    val onCityRecordEvent = MutableLiveData<Unit>()

    val imageList: List<Int> = listOf<Int>(
        R.drawable.ic_vp_precautions_first,
        R.drawable.ic_vp_precautions_second,
        R.drawable.ic_vp_precautions_third,
        R.drawable.ic_vp_precautions_fourth,
        R.drawable.ic_vp_precautions_fifth,
        R.drawable.ic_vp_precautions_sixth
    )

    fun whereImageEvent(view: View) {
        onWhereImageEvent.value = Unit
    }

    fun todayRecordEvent(view: View) {
        onTodayRecordEvent.value = Unit
    }

    fun koreaRecordEvent(view: View) {
        onKoreaRecordEvent.value = Unit
    }

    fun cityRecordEvent(view: View) {
        onCityRecordEvent.value = Unit
    }

}