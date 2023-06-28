package com.pega.myapplication

fun main() {
    cityTemp(City = "Ankara", 27, 31,82)
    cityTemp(City = "Tokyo", 32, 36, 10)
    cityTemp(City = "Cape Town", 59, 64, 2)
    cityTemp(City = "Guatemala City", 50,55,7)
}

fun cityTemp(City: String, l_temp: Int, h_temp: Int, rain: Int){
    println("City: $City \nLow temperature: $l_temp, High temperature: $h_temp \nChance of rain: $rain% \n")
}