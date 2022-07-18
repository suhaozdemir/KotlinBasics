package com.suhaozdemir.kotlinbasics

fun main(){

    // -------------SET-------------
    val fruits = setOf("Orange", "Apple", "Grape", "Apple", "Orange")
    println(fruits.size) // prints 3 because we have Apple and Orange twice

    println(fruits.toSortedSet()) // Remove multiple elements and sort alphabetically

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    println(newFruits.elementAt(3))

    // -------------MAP-------------

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")

    for(key in daysOfTheWeek.keys){
        println("$key is to ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favorite" to Fruit("Apple", 2.5), "OK" to Fruit("Grape", 3.5))

    for(key in fruitsMap.keys){
        println("$key is to ${fruitsMap[key]}")
    }

    val newDaysOfTheWeek = daysOfTheWeek.toMutableMap()
    newDaysOfTheWeek[4] = "Thursday"
    newDaysOfTheWeek[5] = "Friday"

    println(newDaysOfTheWeek.toSortedMap())
}