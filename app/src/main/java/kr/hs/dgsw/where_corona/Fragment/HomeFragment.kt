package kr.hs.dgsw.where_corona.Fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kr.hs.dgsw.where_corona.R
import kr.hs.dgsw.where_corona.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(
            inflater,
            R.layout.fragment_home,
            container,
            false
        )

        binding.btnWhereImage.setOnClickListener {
            Log.d("TEST", "이미지 출처 표기 버튼이 클릭되었습니다.")
            // TODO : AlertDialog 띄워주기
        }

        binding.btnKoreaStatus.setOnClickListener {
            Log.d("TEST", "코로나19 국내 현황 버튼이 클릭되었습니다.")
        }

        return binding.root
    }

}