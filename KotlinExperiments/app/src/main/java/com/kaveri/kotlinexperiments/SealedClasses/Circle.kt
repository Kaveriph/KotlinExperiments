package com.kaveri.kotlinexperiments.SealedClasses

data class Circle(var radius:Int): Shape() {

    override fun draw() {
        println("Drawing inside Circle : $radius")
    }
}