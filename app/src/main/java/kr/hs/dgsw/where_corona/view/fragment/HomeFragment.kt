package kr.hs.dgsw.where_corona.view.activity.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import kr.hs.dgsw.where_corona.R
import kr.hs.dgsw.where_corona.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_home,
            container,
            false
        )

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.btnKoreaStatus.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_koreaStatusFragment)
        }

        binding.btnCityStatus.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_cityStatusFragment)
        }

        binding.btnTodayStatus.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_todayStatusFragment)
        }
    }

}