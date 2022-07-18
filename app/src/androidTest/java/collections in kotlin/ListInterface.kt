package collectionsinkotlin


fun main(args:Array<String>){

    var marks = listOf(67,54,99,87,56,54,99,49)
    println("marks are : $marks")


    ///sorted() method uses in list to sort elements in ascending order
    println("sorted marks are :${marks.sorted()}")


//    converting list items into set using toSet() method.
    println("after converting items into set elements : ${marks.toSet()}")

}



class ListInterface {
}