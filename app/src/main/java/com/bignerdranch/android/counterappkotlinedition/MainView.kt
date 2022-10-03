package com.bignerdranch.android.counterappkotlinedition

interface MainView {
    fun updateCounter(counter:Int)
    fun showToast(text:String)
    fun showSnackbar(text:String)
}