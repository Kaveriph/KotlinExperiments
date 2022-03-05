package com.kaveri.kotlinexperiments.SealedClasses

open class Square(var side:Int): Shape {

    override fun draw() {
        println("Drawing inside Square : $side")
    }
}