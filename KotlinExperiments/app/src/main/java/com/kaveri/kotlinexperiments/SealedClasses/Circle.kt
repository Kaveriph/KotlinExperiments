package com.kaveri.kotlinexperiments.SealedClasses

open class Circle(var radius:Int): Shape {

    override fun draw() {
        println("Drawing inside Circle : $radius")
    }
}