package kr.hs.dgsw.where_corona.view.activity.view.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import kr.hs.dgsw.where_corona.R
import kr.hs.dgsw.where_corona.base.fragment.BaseFragment
import kr.hs.dgsw.where_corona.databinding.FragmentHomeBinding
import kr.hs.dgsw.where_corona.view.dialog.WhereImageFragment
import kr.hs.dgsw.where_corona.viewmodel.HomeViewModel

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {
    override val viewModel: HomeViewModel by viewModels()

    override fun observerViewModel() {
        with(mViewModel) {
            val whereImageDialog = WhereImageFragment()

            onWhereImageEvent.observe(this@HomeFragment, {
                Log.d("TEST", "이미지 출처표기 버튼이 클릭되었습니다.")
                if(!whereImageDialog.isAdded)
                    whereImageDialog.show(activity?.supportFragmentManager!!, whereImageDialog.tag)
            })

            onCityRecordEvent.observe(this@HomeFragment, {
                view?.findNavController()?.navigate(R.id.action_homeFragment_to_cityStatusFragment)
            })

            onKoreaRecordEvent.observe(this@HomeFragment, {
                view?.findNavController()?.navigate(R.id.action_homeFragment_to_koreaStatusFragment)
            })

            onTodayRecordEvent.observe(this@HomeFragment, {
                view?.findNavController()?.navigate(R.id.action_homeFragment_to_todayStatusFragment)
//                mBinding.root?.findNavController()?.navigate(R.id.action_homeFragment_to_todayStatusFragment)
//                위의 코드는 가능하다는 것만 알려주는 코드
            })
        }
    }
}