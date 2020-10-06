package com.tom

fun main() {
//    println("Hello World")
//    Human().hello()
        val h = Human()
        //h.hello()
    // 這裡用var跟val(value)都可以，val代表指定後不能再改變
        val age = 19
        val age2 : Int = 19
    //Kotlin的"自動推斷變數型態"，所以不指定資料型態
        var weight : Float = 66.5f
    //Kotlin跟Java一樣小數點預設都是 Double型態
        var name : String
        name = "Andrei"
}
class Human {
    fun hello(){
        println("Hello Kotlin")
    }
}