package oops_concept_implementation

import java.util.*

//defining encapsulation and abstraction property of OOP  ...

fun main(args: Array<String>){

    val obj: Encapsulation_implementation = Encapsulation_implementation()

    val input: Scanner = Scanner(System.`in`)

    println("enter a integer length")
    var len = input.nextInt()

    println("enter a integer breadth")
    var br = input.nextInt()

    var result:Float = obj.toFindArea(len,br).toFloat()    /// here we usage explicit type conversion, converting Int to Float..//
    println("area of rectangle : $result")
}


class Encapsulation_implementation {

    fun toFindArea(len:Int, br:Int): Int{
        var area:Int = len * br

        return area
    }

}