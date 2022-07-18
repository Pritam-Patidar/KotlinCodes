package kotlin_program


import java.util.Scanner

fun main(args: Array<String>) {

    // creating an object for Scanner class
    val reader: Scanner = Scanner(System.`in`)

    //creating object of IfElseConditions class
    val obj:IfElseConditions =    IfElseConditions()

    println("Enter three numbers: ")

    var num1 = reader.nextInt()
    var num2 = reader.nextInt()
    var num3 = reader.nextInt()

    obj.findMax(num1,num2,num3)


}


class IfElseConditions {


// if else expression's
    fun findMax(n1: Int, n2: Int, n3: Int){
        var max = if ( n1 > n2) {
            if (n1 > n3) {
                "$n1 is the largest number"
            }
            else {
                "$n3 is the largest number"
            }
        }
        else if( n2 > n3){
            "$n2 is the largest number"
        }
        else{
            "$n3 is the largest number"
        }

        println(max)
    }
}