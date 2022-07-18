package com.suhaozdemir.kotlinoopbasics

fun main(){
    var nissanCar = Car()
    println(nissanCar.brand)
    println(nissanCar.model)
    nissanCar.maxSpeed = 280
    println(nissanCar.maxSpeed)
    // nissanCar.price = 120000 cannot do this action because the setter is private but you can get
    println(nissanCar.price)
}

class Car(){
    lateinit var brand : String

    val model : String = "Skyline R34"
        // Custom getter
        get() {
            return field.lowercase()
        }

    var maxSpeed : Int = 250
        //get() = field
        set(value){
            field = if(value > 0) value else throw IllegalAccessException("Max speed cannot below zero")
        }

    var price : Int = 240000
        private set

    init{
        this.brand = "Nissan"
    }
}