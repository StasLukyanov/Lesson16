package com.example.lesson16

import com.example.lesson16.Animals
import com.example.lesson16.AnimalsWorld
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson16.R
import com.example.lesson16.Fish
import com.example.lesson16.Mammals

class Birds(name: String?, weight: Int, age: Int, predatory: Boolean) : AnimalsWorld() {
    override fun fly() {
        super.fly()
    }

    override fun swimming() {
        super.swimming()
    }
}