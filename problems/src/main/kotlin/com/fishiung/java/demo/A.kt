package com.fishiung.java.demo

object A {

    fun main() {
        println("Hello world!")
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("$a + $b = ${a + b}")
}

fun printSum2(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}

class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}


fun main(args: Array<String>) {
    println(args.contentToString())
    println(sum(1, 2))
    println(sum(1, 2))
    printSum(1, 2)
    printSum2(1, 2)

    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}