package oops_concept_implementation


// defining here multilevel inheritance

fun main(args: Array<String>){
    val obj: RightTriangle = RightTriangle()
    obj.toType()
    obj.toType1()
    obj.toType2()

}

open class Shape {
    fun toType(){
        println("all shapes are included in this class")
    }

}

open class Triangle: Shape(){

    fun toType1(){
        println("only triangle shape is included")
    }

}

class RightTriangle: Triangle(){
    fun toType2(){
        println("only right side-triangle is included")
    }

}