package collectionsinkotlin


fun main(args:Array<String>){

        val peopleAges = mutableMapOf<String, Int>(
            "rohit" to 39,
            "virat" to 38
        )


//    put(key,value) is a method to add another key value into the map
        peopleAges.put("shikhar", 37)

//    without using put() method we can also add key value using its shorthand
//        [key name] = value
        peopleAges["rahul"] = 33


        println(peopleAges)


//    update key's value using ->

       peopleAges["rohit"] = 40
       println(peopleAges)
}





class MapInterface {
}