package kotlin_program.lambda_expression

/// defining interface here.

fun main(args: Array<String>){
    val obj: Interface1 = Interface1()
    obj.bar()
}

interface First{
        fun bar()

    }
class Interface1 : First{

    override fun bar() {
      println("interface implemented using kotlin")
    }

}