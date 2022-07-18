package oops_concept_implementation

// defining runtime polymorphism in oop... //
// runtime polymorphism is implement only in inheritance cases... //

fun main(args:Array<String>){
    val obj: RuntimePolymorphism = Derived()
    obj.toRun()
    obj.toRun()

}

open class RuntimePolymorphism {
     open fun toRun(){
        println("this is toRun() function from RuntimePolymorphism class or parent class.")

    }

}

class Derived: RuntimePolymorphism(){
     override fun toRun(){
         super.toRun()
        println("this is toRun() function from Derived class or child class.")
    }

}