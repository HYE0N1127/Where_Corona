package kr.hs.dgsw.where_corona.viewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import io.reactivex.Completable
import io.reactivex.observers.DisposableCompletableObserver
import kr.hs.dgsw.where_corona.base.viewmodel.BaseViewModel

class HomeViewModel : BaseViewModel() {
    val onWhereImageEvent = MutableLiveData<Unit>()
    val onTodayRecordEvent = MutableLiveData<Unit>()
    val onKoreaRecordEvent = MutableLiveData<Unit>()
    val onCityRecordEvent = MutableLiveData<Unit>()

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