package com.kaveri.kotlinexperiments.SealedClasses

data class Rectangle(var length:Int, var breadth:Int) : Shape {

    override fun draw() {
        println("Drawing inside Rectangle : $length X $breadth")
    }
}