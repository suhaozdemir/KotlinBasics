package com.suhaozdemir.kotlinoopbasics

data class User(val id: Long, var name : String)

fun main(){
    val user1 = User(1, "Suha")

    val name = user1.name
    println(name)
    user1.name = "Michael"
    val user2 = User(1, "Michael")

    println(user1 == user2)

    println("User details: $user1")

    val updatedUser = user1.copy(name = "Denis Panjuta")
    println(updatedUser)

    println(updatedUser.component1()) // prints 1
    println(updatedUser.component2()) // prints Denis Panjuta

    val (id, uname) = updatedUser
    println("id: $id, name: $uname")

}