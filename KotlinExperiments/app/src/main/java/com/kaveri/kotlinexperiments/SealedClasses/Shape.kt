package com.kaveri.kotlinexperiments.SealedClasses

sealed class Shape {
    open fun draw() {
        println("drawing inside shape")
    }
}