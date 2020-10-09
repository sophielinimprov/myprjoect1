package com.tom.kotlin

import java.util.*
import kotlin.math.max

fun main() {
//    userinput()
    val stu = Student("Andrei", 77, 99)
    stu.print()
    stu.nameCheck()
    println("Higher score: ${stu.highest()}")

    val test = 123;
    println("Test is $test")

}


class Student(var name: String?, var english: Int, var math: Int){

    fun print(){
//        print(name + "\t" + english + "\t" + math + "\t"
//                + getAverage() + passOrfailed())
//        println("\t" + grading())
        println("$name\t$english\t$math\t${getAverage()}\t${passOrfailed()}\t${grading()}")
    }
    fun getAverage()= (english+math)/2

    fun passOrfailed() = if(getAverage()>=60) "\tPASS" else "FAILED"

    fun grading() = when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun highest()=  if(english>math){println("english")
        english} else {println("math")
        math}

    fun nameCheck()= println(name?.length)
    }


fun userinput() {
    val scanner = Scanner(System.`in`)


    print("Please enter your name")
//    var name = scanner.next()
    var name = null
    print("Please enter english score")
    var english = scanner.nextInt();
    print("Please enter math score")
    var math = scanner.nextInt()

    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()


}