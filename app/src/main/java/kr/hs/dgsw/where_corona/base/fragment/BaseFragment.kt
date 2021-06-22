package kr.hs.dgsw.where_corona.base.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import kr.hs.dgsw.where_corona.BR
import kr.hs.dgsw.where_corona.R
import kr.hs.dgsw.where_corona.base.viewmodel.BaseViewModel
import java.lang.StringBuilder
import java.lang.reflect.ParameterizedType
import java.util.*

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
        observerViewModel()
    }

    private fun performDataBinding() {
        mViewModel = if(::mViewModel.isInitialized) mViewModel else viewModel
        mBinding.setVariable(BR.vm, mViewModel)
        mBinding.lifecycleOwner = this
        mBinding.executePendingBindings()
    }

    @LayoutRes
    private fun layoutRes(): Int {
        val split =
            ((Objects.requireNonNull(javaClass.genericSuperclass) as ParameterizedType).actualTypeArguments[0] as Class<*>)
                .simpleName.replace("Binding$".toRegex(), "")
                .split("(?<=.)(?=\\p{Upper})".toRegex())
                .dropLastWhile { it.isEmpty() }.toTypedArray()

        val name = StringBuilder()

        for(i in split.indices) {
            name.append(split[i].toLowerCase(Locale.ROOT))

            if (i != split.size - 1)
                name.append("_")
        }

        try {
            return R.layout::class.java.getField(name.toString()).getInt(R.layout::class.java)
        }catch (e : IllegalAccessException) {
            e.printStackTrace()
        } catch (e : NoSuchFieldError) {
            e.printStackTrace()
        }

        return 0
    }

}