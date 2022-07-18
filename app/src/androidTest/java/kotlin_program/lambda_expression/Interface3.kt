package kotlin_program.lambda_expression

//implementing two interface into one another interface and extends into another classs...

fun main(args: Array<String>){

    val obj: Interface2 = Interface2()
    obj.bar()
    obj.bar1()
    obj.bar2()
}

interface One1 {
    fun bar() {
        println("hello i am from One1 interface")
    }
}

interface Second2{
    fun bar1(){
        println("hello i am from Second2 interface")
    }

}

interface Third3{
    fun bar2(){
        println("hello i am from Third3 interface")

    }
}
class Interface3 : One1, Second2, Third3 {
}