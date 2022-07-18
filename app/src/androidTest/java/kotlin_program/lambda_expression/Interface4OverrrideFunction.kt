package kotlin_program.lambda_expression


// override function of interface into a class.....

class Interface4OverrrideFunction : Onee1, Secondd2, Thirdd3 {
     override fun bar(){
         println("it is voerriding bar() method of Onee1 interface in another class ")
     }

    override fun bar1() {
        println("it is voerriding bar1() method of Secondd2 interface in another class ")

    }

    override fun bar2() {
        println("it is voerriding bar2() method of Thirdd3 interface in another class ")

    }

}


fun main(args: Array<String>){

    val obj: Interface2 = Interface2()
    obj.bar()
    obj.bar1()
    obj.bar2()
}

interface Onee1 {
    fun bar()
}


interface Secondd2 {
    fun bar1()
}


interface Thirdd3{
    fun bar2()
}