package com.example.mvvmtest.view

import android.os.Bundle
import com.example.mvvmtest.R
import com.example.mvvmtest.databinding.ActivityMainBinding
import com.example.mvvmtest.model.PagerAdapterUserList
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val layoutResourceId: Int get() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewDataBinding.vmMain = getViewModel()
        viewDataBinding.lifecycleOwner=this

        viewDataBinding.vpUserList.adapter = PagerAdapterUserList(supportFragmentManager)
    }
}