package com.suhaozdemir.kotlinbasics

fun main(){
    addNumber(5,10)
    println(sum(5,10))
    sumShorter(5,10)
}

// Lambda Expression is a function which has no name

// Normal Function
fun addNumber(a: Int, b: Int): Int {
    return a+b
}

// Lambda Expression
val sum: (Int, Int) -> Int = {a:Int, b:Int -> a+b}
// Even shorter
val sumShorter = {a: Int, b: Int -> println(a+b)}