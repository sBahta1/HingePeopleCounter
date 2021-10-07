package com.samb.hingepeoplecounter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainPresenterFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainPresenter::class.java)) {
            return MainPresenter() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}