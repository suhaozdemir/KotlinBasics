package com.suhaozdemir.kotlinoopbasics

fun main(){
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
}

class MobilePhone(osName: String, brand: String, model: String){

    var battery = 30

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
        chargeBattery(20)
    }

    fun chargeBattery(chargingBattery: Int){
        println("The phone battery had $battery before now it is ${battery+chargingBattery}")
    }
}