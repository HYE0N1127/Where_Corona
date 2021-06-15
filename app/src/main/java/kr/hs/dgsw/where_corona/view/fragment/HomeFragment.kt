package kr.hs.dgsw.where_corona.view.activity.view.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import kr.hs.dgsw.where_corona.R
import kr.hs.dgsw.where_corona.base.fragment.BaseFragment
import kr.hs.dgsw.where_corona.databinding.FragmentHomeBinding
import kr.hs.dgsw.where_corona.viewmodel.HomeViewModel

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {
    override val viewModel: HomeViewModel by viewModels()

    override fun observerViewModel() {
        with(viewModel) {
            onWhereImageEvent.observe(this@HomeFragment, {
                Log.d("TEST", "이미지 출처표기 버튼이 클릭되었습니다.")
            })

            onCityRecordEvent.observe(this@HomeFragment, {
                Log.d("TEST", "도시별 확진자 기록 체크 버튼이 클릭되었습니다.")
                view?.findNavController()?.navigate(R.id.action_homeFragment_to_cityStatusFragment)
            })

            onKoreaRecordEvent.observe(this@HomeFragment, {
                Log.d("TEST", "한국 확진자 기록 확인 버튼이 클릭되었습니다.")
                view?.findNavController()?.navigate(R.id.action_homeFragment_to_koreaStatusFragment)
            })

            onTodayRecordEvent.observe(this@HomeFragment, {
                Log.d("TEST", "당일 확진자 기록 확인 버튼이 클릭되었습니다.")
                view?.findNavController()?.navigate(R.id.action_homeFragment_to_todayStatusFragment)
            })
        }
    }
}