package com.example.mobile3_week2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class DisplayList(val text:String = ""){
    override fun toString(): String {
        return "$text"
    }
}

class ViewModelClass : ViewModel() {
    var display = mutableListOf<DisplayList>()
    var liveText = MutableLiveData<MutableList<DisplayList>>()

    fun addText(t: DisplayList){
        display.add(t)
        liveText.value = display
    }
}