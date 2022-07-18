package com.suhaozdemir.kotlinoopbasics

fun main(){
    // Creating instances of classes
    var suha = Person("Suha", "Ozdemir", 23)
    suha.hobby = "playing video games"
    suha.stateHobby()
    println("Suha is ${suha.age} years old")
    var john = Person()
    john.hobby = "dancing"
    john.stateHobby()
    var johnPeterson = Person(lastName = "Peterson")
}

class Person(firstName: String = "John", lastName: String = "Doe"){ // <== Primary Constructor
    // Member Variable - Properties
    var age : Int? = null
    var hobby : String = "Watching Movies"
    var firstName : String? = null


    // Initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new Person object with firstName = $firstName, and lastName = $lastName")
    }

    // Secondary Constructor - Member Constructor
    constructor(firstName: String, lastName: String, age: Int) : this(firstName,lastName){
        this.age = age
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName with age $age")
    }

    // Member Functions - Methods
    fun stateHobby(){
        println("$firstName's hobby is $hobby")
    }
}