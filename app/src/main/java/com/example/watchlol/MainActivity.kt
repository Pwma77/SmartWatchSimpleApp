package com.example.watchlol

import android.R
import android.app.Activity
import android.os.Bundle
import com.example.watchlol.databinding.ActivityMainBinding

class MainActivity : Activity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener {
            txt()
        }
    }

    fun txt(){
        binding.text1.text = "sddksjfeskufh"
    }
}