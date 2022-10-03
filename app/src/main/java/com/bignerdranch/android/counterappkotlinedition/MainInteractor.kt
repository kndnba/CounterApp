package com.bignerdranch.android.counterappkotlinedition

 class MainInteractor {
    val MAX_COUNTER = 10
    val MIN_COUNTER = 0

    private val repository = MainRepository()

    fun isNeedToShowSnackbar (counter:Int) = counter >= MAX_COUNTER

    fun isNeedToShowToast (counter:Int) = counter <= MIN_COUNTER

    fun getPlusCounter() = repository.getPlusCounter()

    fun getMinusCounter() = repository.getMinusCounter()

    fun resetCounter() = repository.resetCounter()

    fun getCurrentCounter() = repository.getCurrentCounter()

}
