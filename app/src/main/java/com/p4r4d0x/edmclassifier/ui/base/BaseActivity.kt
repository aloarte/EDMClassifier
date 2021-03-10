package com.p4r4d0x.edmclassifier.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import org.koin.android.viewmodel.ext.android.getViewModel
import kotlin.reflect.KClass

abstract class BaseActivity<baseBinding : ViewDataBinding, baseViewModel : ViewModel>(
    @LayoutRes private val layout: Int,
    private val viewModelClass: KClass<baseViewModel>
) : AppCompatActivity() {
    protected lateinit var mBinding: baseBinding
        private set
    protected lateinit var mViewModel: baseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, layout)
        mViewModel = getViewModel(viewModelClass)
        setUpDataBinding(mBinding, mViewModel)
        observeViewModel(mViewModel)
    }

    protected abstract fun setUpDataBinding(binding: baseBinding, viewModel: baseViewModel)
    protected abstract fun observeViewModel(viewModel: baseViewModel)

}