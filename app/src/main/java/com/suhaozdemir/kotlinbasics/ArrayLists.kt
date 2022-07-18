package com.suhaozdemir.kotlinbasics

/* ArrayLists are used to create a dynamic array. Which means the size of an
ArrayList can be increased or decreased according to your requirement.
The ArrayList class provides both read and write functionalities.
The ArrayList follows the sequence of insertion order
An ArrayList is non synchronized and it may contain duplicate elements*/

// Constructor of ArrayList

/* ArrayList<E>(): Is used to create an empty ArrayList
ArrayList(capacity: Int): Is used to create an ArrayList of specified capacity.
ArrayList(elements: Collection<E>): Is used to create an ArrayList filled with the elements of the collection.
*/

// Functions of ArrayList

/* open fun add(element:E): Boolean -> add element
open fun clear() -> remove all
open fun get(index: Int):E -> return rhe element at specified index in the list
open fun remove(element:E): Boolean -> remove a single instance of a specific element if exists
 */

fun main(){
//    val arrayList = ArrayList<String>()
//    arrayList.add("One")
//    arrayList.add("Two")
//    println(".....print ArrayList.....")
//
//    for(i in arrayList){
//        println(i)
//    }


    // Filling arrayList using collections
    val arrayList: ArrayList<String> = ArrayList<String>(5)
    val list: MutableList<String> = mutableListOf<String>()

    list.add("One")
    list.add("Two")

    arrayList.addAll(list)

    val itr = arrayList.iterator()

    println(".....print ArrayList.....")
    while (itr.hasNext()){ // As long as arrayList have another entry
        println(itr.next())
    }
    println("Size of arrayList = ${arrayList.size}")
    println(arrayList.get(1))
}