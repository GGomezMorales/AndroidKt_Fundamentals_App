package com.ggomezmorales.fundamentalsapp

import java.io.Serializable

data class Person(
    val fistName: String,
    val lastName: String,
    val birthday: String,
    val country: String
): Serializable
