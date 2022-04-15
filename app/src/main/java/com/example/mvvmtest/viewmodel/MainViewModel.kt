package com.example.mvvmtest.viewmodel

import android.view.View
import com.example.mvvmtest.common.NotNullMutableLiveData

class MainViewModel: BaseViewModel() {
    val keyword = NotNullMutableLiveData<String>("")
    val count = NotNullMutableLiveData<Int>(0)

    fun onClickSearch(view: View){

    }
}