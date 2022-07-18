package kotlin_program


fun main(args: Array<String>) {

    val obj:DefineLoopUsingArray = DefineLoopUsingArray()
    obj.forUsing_arrayOf1()
    obj.forUsing_arrayOf2()
    obj.iteratingStringChar()
}
class DefineLoopUsingArray {

    fun forUsing_arrayOf1(){
        var lang: Array<String> = arrayOf("C", "C++", "Java", "Kotlion")

        for (item in lang)
            println(item)
    }


    fun forUsing_arrayOf2(){
        var lang: Array<String> = arrayOf("C", "C++", "Java", "Kotlion")

        for (item in lang.indices) {

            // printing array elements having even index
            if (item % 2 == 0)
                print(lang[item]+" ")
        }

    }


// Iteration of a string char
    fun iteratingStringChar() {

        var text: String = "Android App Development using Kotlin"
        println()
        for (item in text) {
            println(item)
        }

    }

}
