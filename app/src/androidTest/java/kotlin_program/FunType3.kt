package kotlin_program

//10 type function
fun main(args: Array<String>) {
    val obj: FunType3 = FunType3()

    val result:Int = obj.fineMode()
    println("mode of these two number is : $result")
}


class FunType3 {
    fun fineMode(): Int{
        println("enter num1")
        val n1 = Integer.parseInt(readLine())

        println("enter num2")
        val n2 = Integer.parseInt(readLine())

        val mode:Int = n1 % n2
        return mode
    }
}