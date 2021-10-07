package com.samb.hingepeoplecounter

import android.graphics.Color
import androidx.lifecycle.ViewModel

class MainPresenter :ViewModel(){
    private var totalCount = 0
    private var mainCount = 0

    fun isMinusBtnInvisible():Boolean{
        return mainCount <= 0
    }

    fun getMainCount():String{
        return "${mainCount} people"
    }
    fun getTotalCount():String{
        return "Total: ${totalCount}"
    }

    fun getMCColor():Int{
       return if (mainCount > 15 ){
            Color.RED
        }else{
            Color.rgb(88, 0, 236)
        }
    }

   fun addPerson() {
        totalCount++
        mainCount++
    }

   fun removePerson() {
        mainCount--
    }

    fun resetCount() {
        totalCount = 0
        mainCount = 0
    }
}