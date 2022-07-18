package collectionsinkotlin



fun main(args: Array<String>){

// store key value using mapOf() mathod.
    val mapSequince = mapOf<Int,String>(
        1 to "Ajay",
        2 to "suresh",
        3 to "ramesh")

    println(mapSequince)


// containsKey() method is used to cheak that key is contains or not..
    println(mapSequince.containsKey(4))
    println(mapSequince.containsKey(2))

//    containsValue() used to check that value is contains or not in map

    println(mapSequince.containsValue("ajay"))
    println(mapSequince.containsValue("Ajay"))






}
class MapInterface2 {
}