package oops_concept_implementation

 /// defining compile time polymorphism in oops...!

fun main(args: Array<String>){

    val obj: CompileTimePolymorphism = CompileTimePolymorphism()

    var result1: Int = obj.toAdd(20,30)
    var result2: Int = obj.toAdd(20,30,40)
    var result3: Float = obj.toAdd(32.0f,41.65f)

    println("sum of two integer value is : $result1")
    println("sum of two floating value is : $result3")
    println("sum of three integer value is : $result2")

}

class CompileTimePolymorphism {

    fun toAdd(n1: Int, n2: Int): Int{
     return (n1+n2)
    }


    fun toAdd(n1: Float, n2: Float): Float{
     return (n1+n2)
    }

    fun toAdd(n1: Int, n2: Int, n3: Int): Int{
     return (n1+n2+n3)
    }


}