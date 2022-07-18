package collectionsinkotlin



fun main() {

    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")

    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
    println(filteredWords)


    val filteredWords1 = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
    println(filteredWords1)

    val filteredWords2 = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
    println(filteredWords2)

    val filteredWords3 = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredWords3)



    val filteredWords10= words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredWords10)
}

class ListInterfaceAdvance {
}