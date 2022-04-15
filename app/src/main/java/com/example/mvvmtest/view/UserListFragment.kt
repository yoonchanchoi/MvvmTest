package com.example.mvvmtest.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mvvmtest.R
import com.example.mvvmtest.databinding.FragmentUserListBinding
import org.koin.androidx.viewmodel.ext.android.getViewModel

class UserListFragment : BaseFragment<FragmentUserListBinding>() {

    override val layoutResourceId: Int get() = R.layout.fragment_user_list


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewDataBinding.vmUserList = getViewModel()
    }

}