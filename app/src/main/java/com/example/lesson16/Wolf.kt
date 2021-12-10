package com.example.lesson16

import com.example.lesson16.Animals
import com.example.lesson16.AnimalsWorld
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson16.R
import com.example.lesson16.Fish
import com.example.lesson16.Mammals

class Wolf(name: String?, wieght: Int, age: Int, predatory: Boolean) :
    Mammals(name, wieght, age, predatory) {
    override fun swimming() {
        super.swimming()
    }

    override fun drinkMilk() {
        super.drinkMilk()
    }
}