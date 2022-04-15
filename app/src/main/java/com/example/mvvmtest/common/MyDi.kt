package com.example.mvvmtest.common

import com.example.mvvmtest.viewmodel.MainViewModel
import com.example.mvvmtest.viewmodel.UserListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

var viewModelpart = module {
    viewModel {
        MainViewModel()
    }
    viewModel {
        UserListViewModel()
    }
}
var myDiModule = listOf(
    viewModelpart
)