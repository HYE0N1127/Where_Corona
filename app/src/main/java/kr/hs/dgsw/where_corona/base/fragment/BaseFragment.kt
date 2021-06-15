package kr.hs.dgsw.where_corona.base.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import kr.hs.dgsw.where_corona.base.viewmodel.BaseViewModel

abstract class  BaseFragment<VB : ViewDataBinding, VM : BaseViewModel> : Fragment() {
    protected lateinit var mBinding: VB
    protected lateinit var mViewModel: VM

    protected abstract val viewModel: VM

    protected abstract fun observerViewModel()
    protected open fun onErrorEvent(e: Throwable) {

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(
            inflater, layoutRes(), container, false
        )!!
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        performDataBinding()

        mViewModel.errorEvent.observe(viewLifecycleOwner, { onErrorEvent(it) })
        
    }

}