package kotlin_program.companionobject

class CompanionObject {

    fun toCheak(){
        println("fun inside a class only")
    }

    companion object{

        var num = 100
        fun staticFun(){
            println("this is static function define inside the companion object")

        }
    }

}


fun main(args: Array<String>){
//    static fun inside companion object call using class name only and variable also...
    CompanionObject.staticFun()
    println(CompanionObject.num)


//    calling using object creation of normal function
    println()
    var obj: CompanionObject = CompanionObject()
    obj.toCheak()
}