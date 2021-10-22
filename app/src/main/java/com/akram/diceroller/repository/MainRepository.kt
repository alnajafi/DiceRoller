package com.akram.diceroller.repository

import kotlin.random.Random

class MainRepository {

    fun randomNumber(): Int{
        val random = Random(System.nanoTime())
        return (1..6).random(random)
    }
}