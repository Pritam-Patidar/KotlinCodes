package collectionsinkotlin


fun main(args:Array<String>){
    // it cant contaion duplicate value but an list can contain
    // it can not having ordered and unordered manner element stored in set
    // but in list can contain ordered element stored

    val numbers = setOf(1,2,33,10,5,6,7,8,6,5)
    println("after removing element set elements are :$numbers")

    println(numbers.contains(8))

    println(numbers.sorted())

}
class SetInterface {
}