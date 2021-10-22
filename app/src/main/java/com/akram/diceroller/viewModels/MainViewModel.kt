package com.akram.diceroller.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.akram.diceroller.repository.MainRepository

class MainViewModel : ViewModel() {

    private val repository = MainRepository()
    val diceNumber = MutableLiveData<Int>()

    fun randNumber(){
        diceNumber.postValue(repository.randomNumber())
    }
}
