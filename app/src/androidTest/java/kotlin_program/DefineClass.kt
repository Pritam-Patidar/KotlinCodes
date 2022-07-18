package kotlin_program

fun main(args: Array<String>) {
    val obj: DefineClass = DefineClass()

    println("enter num1")
    val num1 = Integer.parseInt(readLine())

    println("enter num2")
    val num2 = Integer.parseInt(readLine())

    val result: Int = obj.addNum(num1, num2)
    println("sum of $num1 and $num2 is : $result")

}

class DefineClass {
    fun addNum(a: Int, b: Int): Int {
        val sum = a + b
        return sum
    }
}