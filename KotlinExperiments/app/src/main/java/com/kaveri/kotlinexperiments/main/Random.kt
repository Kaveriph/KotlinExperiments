package com.kaveri.kotlinexperiments.main

import com.kaveri.kotlinexperiments.SealedClasses.Circle

data class Random(var rad:Int): Circle(rad) {

    override fun draw() {
        println("Drawing inside Random : $rad")
    }
}