package collectionsinkotlin

fun main(args:Array<String>){
// checking two set value that these are equal or not in different order stored
    // sert can contain only unique value means no duplicate in setOf() method

    val set1 = setOf(1,2,3)
    val set3 = mutableSetOf(3,1,2)
    val set2 = setOf(1,3,2)


    println("$set1 == $set2 : ${set1 == set2}")
    println("$set1 == $set3 : ${set1 == set3}")


//    finding intersect and unions of two set.
//    intersect()  function return's value these are common in two set's
//    union() function return's value these are without replacing value or all values are come's without reputation

    val set4 = setOf(1,2,3,4,5)
    val set5 = setOf(1,2,3,6)


    println(set4.intersect(set5))
    println(set4.union(set5))
}
class SetInterface2 {
}