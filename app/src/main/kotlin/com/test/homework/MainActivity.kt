package com.test.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.test.homework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding by viewBinding (ActivityMainBinding::bind)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
calculateBtn.setOnClickListener() {
    resultTV.text = Math().divide(firstET.text.toString(),secondET.text.toString())
}
        }
    }
}