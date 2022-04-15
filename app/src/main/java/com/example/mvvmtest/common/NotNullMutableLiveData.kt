package com.example.mvvmtest.common

import androidx.lifecycle.MutableLiveData

class NotNullMutableLiveData<T : Any>(_defaultValue: T) : MutableLiveData<T>() {

    init {
        value = _defaultValue
    }

    override fun getValue() = super.getValue()
}