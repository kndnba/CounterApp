package com.bignerdranch.android.counterappkotlinedition

class MainPresenter(val view: MainView) {
    private val interactor = MainInteractor()

    private var currentCounter = 0

    fun onPlusClicked() {
        currentCounter = interactor.getCurrentCounter()
        if (interactor.isNeedToShowSnackbar(currentCounter)) {
            view.showSnackbar("too much")
        } else {
            currentCounter = interactor.getPlusCounter()
            view.updateCounter(currentCounter)
        }
    }

    fun onMinusClicked() {
        currentCounter = interactor.getCurrentCounter()
        if (interactor.isNeedToShowToast(currentCounter)) {
            view.showToast("numbers below zero doesn't exist you dum dum")
        } else {
            currentCounter = interactor.getMinusCounter()
            view.updateCounter(currentCounter)
        }
    }

    fun onResetClicked(){
        currentCounter = interactor.resetCounter()
        view.updateCounter(currentCounter)
    }
}