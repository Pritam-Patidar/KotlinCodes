package collectionsinkotlin



fun main() {

    val findSquire: (Int) -> Int = { a: Int -> a * a }
    println(findSquire(5))


//    here it is a keyword which is working as asingle parameter in lambda expression..
    val findSquire1: (Int) -> Int = { it * it }
    println(findSquire1(10))

/////////////////////////////////////////////////////////////////////////////////////////////////

    val userData = mapOf<Int,String>(
        1 to "Umesh",
        2 to "jagish",
        3 to "jay"
    )
    println(userData.filter { it.value.length <= 3 })

//    here we are using sortedWith() method expression for two string using their length
    val list = listOf("hello","DEAR")
    println(list.sortedWith { str1: String, str2: String -> str1.length - str2.length })

}


class LambdaHighOrderFunction {
}