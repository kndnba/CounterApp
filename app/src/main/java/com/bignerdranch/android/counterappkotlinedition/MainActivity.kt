package com.bignerdranch.android.counterappkotlinedition

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bignerdranch.android.counterappkotlinedition.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), MainView {
    private lateinit var counterText: TextView
    private lateinit var presenter: MainPresenter

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = MainPresenter(this)

        counterText = findViewById(R.id.counterText)

        with(binding) {
            this.plusButton.setOnClickListener {
                presenter.onPlusClicked()
            }

            this.minusButton.setOnClickListener {
                presenter.onMinusClicked()
            }

            this.resetButton.setOnClickListener {
                presenter.onResetClicked()
            }
        }
    }

    override fun updateCounter(counter: Int) {
        counterText.text = counter.toString()
    }

    override fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }

    override fun showSnackbar(text: String) {
        Snackbar.make(binding.activityMain, text, Snackbar.LENGTH_LONG).show()
    }
}