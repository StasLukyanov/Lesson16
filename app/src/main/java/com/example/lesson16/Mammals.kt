package com.example.lesson16

abstract class Mammals(name: String?, wieght: Int, age: Int, predatory: Boolean) : Animals {
    override fun drinkMilk() {}
    override fun fly() {}
    override fun swimming() {}
}