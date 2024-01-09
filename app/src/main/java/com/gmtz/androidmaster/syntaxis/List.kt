package com.gmtz.androidmaster.syntaxis

fun main() {
    val readOnly: List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    val example = readOnly.filter { it.contains("a") }

    readOnly.forEach { weekDay -> println(weekDay) }
}