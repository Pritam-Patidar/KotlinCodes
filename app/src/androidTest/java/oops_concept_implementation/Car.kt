package oops_concept_implementation

// Defining here hierarchical inheritance.

fun main(argument: Array<String>){
    val obj: Venom_GT = Venom_GT()
    val obj1: Hyundai = Hyundai()
    obj.toRun()        // calling method from Venom_GT class object
    obj.toFastRun()    // calling method from Venom_GT class object

    obj1.toRun()       // calling method from Hyundai class object
    obj1.toRunAvg()    // calling method from Hyundai class object
}

open class Car {
    fun toRun(){
        println("this is toRun() method from parent class -> Car")
    }
}

class Venom_GT : Car(){
     fun toFastRun(){
         println("this car runs too fast in the world")
     }
}

class Hyundai : Car(){
     fun toRunAvg(){
         println("this car runs at normal speed")
     }
}