package kotlin_program.lambda_expression

//defining abstract class here

abstract class Abstract_Class {
    abstract fun run()
//    companion object{
//        fun run2(){}
//
//    }

}

class Honda: Abstract_Class(){

    override fun run(){
        println("Honda is running safely..")
    }

}
fun main(args: Array<String>){

    val obj = Honda()
    obj.run();

}
