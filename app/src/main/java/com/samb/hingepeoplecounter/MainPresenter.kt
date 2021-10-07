package com.samb.hingepeoplecounter

import android.graphics.Color
import androidx.lifecycle.ViewModel

class MainPresenter (val repository: MainRepository):ViewModel(){
    private var totalCount = repository.getTotalCount()
    private var mainCount = repository.getMainCount()

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

    fun updateStoredCounts(){
        repository.setMainCount(mainCount)
        repository.setTotalCount(totalCount)
    }

   fun addPerson() {
        totalCount++
        mainCount++
       updateStoredCounts()
    }

   fun removePerson() {
        mainCount--
       updateStoredCounts()
    }

    fun resetCount() {
        totalCount = 0
        mainCount = 0
        updateStoredCounts()
    }
}