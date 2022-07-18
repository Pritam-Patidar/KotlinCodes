package oops_concept_implementation

/// Defining here Single Level Inheritance

fun main(args: Array<String>){
    val obj = Dog()
    obj.toEat()    //  calling method from parent class using derived class object
    obj.toBark()  //   calling method using child class object

}
open class Animal {
//    parent class which is declared using open keyword...
    fun toEat(){
        println("this is toEat() method from Animal class. ")
    }
}

class Dog: Animal(){

     fun toBark(){
         println("this is toBark() method from Dog class")
     }

}