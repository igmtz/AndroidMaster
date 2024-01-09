package com.gmtz.androidmaster.syntaxis

fun main() {
    print("Hello")

    val age: Int = 30 // Values between - 2,147,483,647 to 2,147,483,647
    val biggerNumber: Long = 45 // Values between - 9,223,372036,854,775,807 to 9,223,372036,854,775,807, bigger space in memory
    val floatExample: Float = 2.36f // Supports until six decimals
    val doubleExample: Double = 2.344 // Supports until fourteen decimals

    var charExample: Char = 'e'
    val stringExample: String = "Hello"

    val booleanExample: Boolean = true

    print("\nLa edad es de $age\n") // Referencing a value

    showMyAge(30)
    add(25, 10)
    println(subtract(25, 10))
    println(subtractOneLine(25, 10))
}

fun showMyAge(currentAge: Int) {
    println("My current age is $currentAge")
}

fun add(firstNumber: Int, secondNumber: Int) {
    val sum = firstNumber + secondNumber
    println("The result of adding $firstNumber and $secondNumber is $sum")
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtractOneLine(firstNumber: Int, secondNumber: Int): Int = firstNumber + secondNumber