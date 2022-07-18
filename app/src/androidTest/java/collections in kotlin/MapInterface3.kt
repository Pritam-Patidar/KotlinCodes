package collectionsinkotlin



fun main(args:Array<String>){
    val userData = mapOf<Int,String>(
        1 to "Umesh",
        2 to "jagish",
        3 to "jay"
    )
//   printing using simple method.
    print(userData)

//   printing using for-in loop method.
    println()
    for(item in userData){
        print(" $item  , ")
    }

//    printing using for Each method.
    println()
    userData.forEach{
        print("${it.key} is ${it.value}, ")
    }


//    printing using map() method.
//    joinToString() is used to separate a string by , or whatever we want we can add into string
//    and it is forget to separate last item by ,
    println()
   print(userData.map{
        "${it.key} is ${it.value}"
    }.joinToString(", ") )
}


class MapInterface3 {
}