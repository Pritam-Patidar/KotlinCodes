package kotlin_program

// 00 type function
fun main(args: Array<String>) {
    val obj: FunType1 = FunType1()
    obj.addName()

}


class FunType1 {
    fun addName(){
        println("enter first Name")
        val x = readLine()

        println("enter last Name")
        val y = readLine()
        val fName=x+" "+y
        println("full name is $fName")
    }

}