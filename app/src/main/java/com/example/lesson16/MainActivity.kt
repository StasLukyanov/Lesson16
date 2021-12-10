package com.example.lesson16

import com.example.lesson16.Animals
import com.example.lesson16.AnimalsWorld
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson16.R
import com.example.lesson16.Fish
import com.example.lesson16.Mammals

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bream = Fish("Shark", 450, 50, true)
    }
}