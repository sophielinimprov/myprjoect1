package com.tom

fun main() {
//    println("Hello World")
//    Human().hello()
        val h = Human()
        h.hello()
    // 這裡用var跟val(value)都可以，val代表建立後不能再更動值
}
class Human {
    fun hello(){
        println("Hello Kotlin")
    }
}