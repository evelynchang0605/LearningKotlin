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

/* Print result
City: Ankara 
Low temperature: 27, High temperature: 31 
Chance of rain: 82% 

City: Tokyo 
Low temperature: 32, High temperature: 36 
Chance of rain: 10% 

City: Cape Town 
Low temperature: 59, High temperature: 64 
Chance of rain: 2% 

City: Guatemala City 
Low temperature: 50, High temperature: 55 
Chance of rain: 7% 
*/
