package com.suhaozdemir.kotlinoopbasics

/* The class that inherits the features of another
class is called the Sub class or Child class or
Derived class, and the class whose features are
inherited is called the Super class or Parent class
or base class */

// Super Class, Parent Class, Base Class
//open class Vehicle{
//    // properties
//    // methods
//}

fun main(){
    val nissanR34 = Cars(240.0,"R34", "Nissan")
    val teslaS = ElectricCar(260.0,"S-Model", "Tesla", 85.0)

    teslaS.extendRange(200.0)
    teslaS.drive()
    // Polymorphism
    nissanR34.drive(300.0)
    teslaS.drive(120.0)

    teslaS.brake()
    nissanR34.brake()
}

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

// Sub Class, Child Class or Derived Class of Vehicle Class
// Super Class, Parent Class or Base Class of ElectricCar Class
open class Cars(override val maxSpeed: Double, val name: String, val brand: String) : Drivable{
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }

    override fun drive() = "Driving the interface drive"

    open fun drive(distance: Double){
        println("$brand drove for $distance KM")
    }

}

// Sub Class, Child Class or Derived Class of Cars Class
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double) : Cars(maxSpeed, name, brand){

    override var range = batteryLife * 6

    override fun drive(distance: Double){
        println("$brand drove for $distance KM on electricity")
    }

    override fun drive() : String = "$brand drove for $range KM on electricity"

    override fun brake() {
        super.brake()
        println("Brake inside of electric car")
    }

}