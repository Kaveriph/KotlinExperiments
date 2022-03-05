package com.kaveri.kotlinexperiments.SealedClasses

fun main() {

    testSealedClasses()
}

fun testSealedClasses() {

    var circle = Circle(5)
    var square:Shape = Square(4)
    var rectangle:Shape = Rectangle(3, 5)

    circle.draw()
    square.draw()
    rectangle.draw()
}
