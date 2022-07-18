package kotlin_program


// all types to define for loop's
fun main(args: Array<String>) {


    val ref:ForLoopingDefiningType = ForLoopingDefiningType()
    ref.forLoopingTypes()    // function calling using object

}

class ForLoopingDefiningType {

    fun forLoopingTypes(){

//  Type 1 ->
        print("for i in 1..5  printing(i) = ")
        for (i in 1..5) print(i)

        println()


//  Type 2 ->
        print("for i in 5 downTo 1 printing(i) = ")
        for (i in 5 downTo 1) print(i)

        println()


//  Type 3 ->
        print("for i in 1..5 step 2  printing(i) using number stepping = ")
        for (i in 1..5 step 2) print(i)

        println()


//  Type 4 ->
        print("for (i in 5 downTo 1 step 2) print(i) = ")
        for (i in 5 downTo 1 step 2) print(i)
    }

}