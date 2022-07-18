package kotlin_program.lambda_expression


fun main(args: Array<String>){
    val obj: Interface2 = Interface2()
    obj.bar()
    obj.bar1()
    obj.bar2()
}

interface One {
    fun bar() {
        println("hello i am from First interface")
    }
}

interface Second{
    fun bar1(){
        println("hello i am from Second interface")
    }

}

interface Third{
    fun bar2(){
        println("hello i am from third interface")

    }

}

class Interface2: Third,Second,One{

}