package kr.hs.dgsw.where_corona.view.dialog

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kr.hs.dgsw.where_corona.R
import kr.hs.dgsw.where_corona.databinding.FragmentWhereImageDialogBinding

class WhereImageFragment : DialogFragment() {

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

        return binding.root
    }
}