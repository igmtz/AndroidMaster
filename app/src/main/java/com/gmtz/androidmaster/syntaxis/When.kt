package com.gmtz.androidmaster.syntaxis

fun main() {

    val month: Int = 2

    when(month) { // It works like a switch stament
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> {
            println("El mes de")
            println("Agosto")
        }
        9, 10, 11, 12 -> println("Ultimos 4 meses")
        in 13..18 -> println("Utilizando un rango")
        else -> println("No válido")
    }

    result(false)
}

fun result(value: Any) { // We can check inside a When statement the object type
    when(value) {
        is Int -> value * 2
        is String -> println(value)
        is Boolean -> println(value)
    }
}