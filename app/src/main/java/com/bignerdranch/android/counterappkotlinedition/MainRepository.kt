package com.bignerdranch.android.counterappkotlinedition

class MainRepository {
private var counter = 0

    fun getPlusCounter():Int {
        return ++counter
    }

    fun getMinusCounter():Int{
        return --counter
    }

    fun getCurrentCounter():Int {
        return counter
    }

    fun resetCounter():Int{
        counter = 0
        return counter
    }
}