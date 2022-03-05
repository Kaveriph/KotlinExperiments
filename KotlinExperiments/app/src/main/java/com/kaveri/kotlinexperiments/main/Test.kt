package com.kaveri.kotlinexperiments.SealedClasses

import com.kaveri.kotlinexperiments.ErrorHandling.EnumWay.LoadState
import com.kaveri.kotlinexperiments.ErrorHandling.EnumWay.Repository
import com.kaveri.kotlinexperiments.main.Random
import com.kaveri.kotlinexperiments.SealedClasses.Shape as Shape1

fun main() {

    //testSealedClasses()
}


fun testSealedClasses() {

    val shape = object : Shape1 {

    }
    val circle: Shape1 = Random(5)
    val square: Shape1 = Square(4)
    val rectangle: Shape1 = Rectangle(3, 5)

    val listOfShapes = arrayListOf<Shape1>()
    listOfShapes.add(circle)
    listOfShapes.add(square)
    listOfShapes.add(rectangle)
    for(item in listOfShapes)
        when (item) {
            is Random -> {
                println("random")
                item.draw()
            }
            is Square -> {
                println("Square")
                item.draw()
            }
            is Rectangle -> {
                println("Rectangle")
                item.draw()
            }
        }
}
