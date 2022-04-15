package com.example.mvvmtest.model

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mvvmtest.view.UserListFragment
import java.text.FieldPosition

class PagerAdapterUserList(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int) : Fragment {
        return UserListFragment()
    }

    override fun getCount(): Int{
        return 1
    }
}