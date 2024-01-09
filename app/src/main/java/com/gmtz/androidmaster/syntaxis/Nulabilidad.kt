package com.gmtz.androidmaster.syntaxis

// En Kotlin las variables pueden ser nulas

fun main() {
    val name: String? = null

    println(name!![0]) // 100% seguro de que no es null
    println(name?.get(1) ?: "Es null") // Si name no es null, dame el valor. Agrega un valor si es nulo con el operador Elvis
}