package com.suhaozdemir.kotlinbasics

fun main(){

// method one
    val numbers: IntArray = intArrayOf(1,2,3,4,5,6)

// method two
    val numbers2 = intArrayOf(1,2,3,4,5,6)

// method three

    val numbers3 = arrayOf(1,2,3,4,5,6)

    println("Initial values ${numbers3.contentToString()}")

    numbers3[0] = 6
    numbers3[1] = 5
    numbers3[4] = 2
    numbers3[5] = 1

    println("Final values ${numbers3.contentToString()}")

    val days = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    println(days.contentToString())

    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Grape", 3.5))
    println(fruits.contentToString())

    for (fruit in fruits){
        println(fruit.name)
    }

    for (index in fruits.indices){
        println("${fruits[index].name} is in index $index")
    }

    val mixedArray = arrayOf("Sunday", 1, Fruit("Apple", 2.5))
    println(mixedArray.contentToString())
}

data class Fruit(val name: String, val price: Double)
