package com.suhaozdemir.kotlinbasics

fun main(){

    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1,2,3,true,false,"String")

    println(anyTypes.size)

    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("July")
    println(additionalMonths)

    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    days[2] = "Sunday"
    // days.removeAt(3)
    val removedDaysList = mutableListOf<String>("Mon", "Wed")
    days.removeAll(removedDaysList)
    // days.removeAll(days)
    println(days)
}