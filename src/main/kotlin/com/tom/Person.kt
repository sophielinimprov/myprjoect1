package com.tom

fun main() {
//    println("Hello World")
//    Human().hello()
        val h = Human(weight = 66.5f, height = 1.7f)
        println(h.bmi())
        val score = 88
        println(score>80)
        val c : Char = 'A';
        println(c.toInt() > 80)
        //?Java???Kt??????????
        /*val age = 19
        val age2 : Int = 19

        var weight : Float = 66.5f

        var name : String
        name = "Andrei"*/
}
class Human ( var weight : Float, var height : Float, var name : String = "") {
    init{
        println("test $weight") //$????????$weight????
    }
//    constructor(name: String, weight: Float, height: Float) : this(weight, height)
    //???constructor?"?????" ??????????val?var
    fun bmi() : Float {
        val bmi = weight/(height*height)
        return bmi
    }
    fun hello(){
        println("Hello Kotlin")
    }
}