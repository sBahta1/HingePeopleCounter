package com.samb.hingepeoplecounter

import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainPresenterFactory (val sharedPreferences: SharedPreferences): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainPresenter::class.java)) {
            return MainPresenter(MainRepository(sharedPreferences)) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}