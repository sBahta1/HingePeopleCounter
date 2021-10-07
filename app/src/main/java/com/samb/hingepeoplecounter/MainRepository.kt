package com.samb.hingepeoplecounter

import android.content.SharedPreferences
import androidx.core.content.edit

class MainRepository(val sharedPreferences: SharedPreferences) {

    fun getMainCount(): Int {
        return sharedPreferences.getInt("mainCount", 0)
    }
    fun getTotalCount(): Int {
        return sharedPreferences.getInt("totalCount", 0)
    }

    fun setMainCount(count: Int) {
        sharedPreferences.edit {
            putInt("mainCount", count)
        }
    }

    fun setTotalCount(count: Int) {
        sharedPreferences.edit {
            putInt("totalCount", count)
        }
    }
}