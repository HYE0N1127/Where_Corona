package kr.hs.dgsw.where_corona.viewmodel

import androidx.lifecycle.MutableLiveData
import io.reactivex.Completable
import io.reactivex.observers.DisposableCompletableObserver
import kr.hs.dgsw.where_corona.base.viewmodel.BaseViewModel

class HomeViewModel : BaseViewModel() {
    val onWhereImageEvent = MutableLiveData<Unit>()
    val onTodayRecordEvent = MutableLiveData<Unit>()
    val onKoreaRecordEvent = MutableLiveData<Unit>()
    val onCityRecordEvent = MutableLiveData<Unit>()

    fun whereImageEvent() {
        onWhereImageEvent.value = Unit
    }

    fun todayRecordEvent() {
        onTodayRecordEvent.value = Unit
    }

    fun koreaRecordEvent() {
        onKoreaRecordEvent.value = Unit
    }

    fun cityRecordEvent() {
        onCityRecordEvent.value = Unit
    }
}