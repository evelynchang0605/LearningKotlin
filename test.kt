package com.pega.myapplication

import java.sql.DriverManager.println

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    val addResult = add(firstNumber, secondNumber)
    val subtractResult = subtract(thirdNumber, firstNumber)
    val multipliedResult = multiplied(firstNumber,secondNumber)
    val dividedResult = divided(firstNumber,thirdNumber)

    println("$firstNumber + $secondNumber = $addResult")
    println("$thirdNumber - $firstNumber = $subtractResult")
    println("$firstNumber * $secondNumber = $multipliedResult")
    println("$firstNumber / $thirdNumber = $dividedResult")
}

// Define add() function below this line
fun add(num1: Int, num2: Int): Int{
    val addResult = num1 + num2

    return addResult
}

// Define subtract() function below this line
fun subtract(num1: Int, num2: Int): Int{
    val subtractResult = num1 - num2

    return subtractResult
}
// Define multiplied() function below this line
fun multiplied(num1: Int, num2: Int): Int{
    val multipliedResult = num1 * num2

    return multipliedResult
}
// Define divided() function below this line
fun divided(num1: Int, num2: Int): Double {
    val num3 = num1.toDouble()
    val num4 = num2.toDouble()
    val dividedResult = num3 / num4

    return dividedResult
}
