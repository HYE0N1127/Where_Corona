package kr.hs.dgsw.where_corona.Fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import kr.hs.dgsw.where_corona.R
import kr.hs.dgsw.where_corona.databinding.FragmentWhereImageDialogBinding

class WhereImageDialogFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentWhereImageDialogBinding>(
            inflater,
            R.layout.fragment_where_image_dialog,
            container,
            false
        )

        super.onCreateView(inflater, container, savedInstanceState)

        dialog?.window?.decorView?.setBackgroundColor(Color.TRANSPARENT)

        return binding.root
    }

}