package kotlin_program

import java.util.*


fun main(args: Array<String>) {

    val obj: DoWhileLoopCode = DoWhileLoopCode()

    val reader:Scanner = Scanner(System.`in`)

    var num: Int = reader.nextInt()
    var factResult:Int = obj.toFindFactorial(num)


    println("Factorial of $num is $factResult")
}


class DoWhileLoopCode {

    fun toFindFactorial(num:Int): Int{
        var factorial:Int = 1
        var number:Int = num

        do{
           factorial = factorial * number
           number--
        } while(number > 0)

        return factorial
    }
}