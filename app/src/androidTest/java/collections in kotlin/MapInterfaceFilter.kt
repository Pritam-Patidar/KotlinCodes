package collectionsinkotlin


fun main(args:Array<String>){

    val userData = mapOf<Int,String>(
        1 to "Umesh",
        2 to "jagish",
        3 to "jay"
    )

    var checkResult = userData.filter { it.key < 2 }
    println(checkResult)

    var checkResult1 = userData.filter { it.key == 3 }
    println(checkResult1)

    var checkResult2 = userData.filter { it.value == "Umesh" }
    println(checkResult2)

    var checkResult3 = userData.filter { it.value.length > 5 }
    println(checkResult3)

    var checkResult4 = userData.filter { it.value.contains("jay") }
    println(checkResult4)

    var checkResult5 = userData.filter { it.value.contains("pritam") }
    println(checkResult5)

    var checkResult6 = userData.filter { it.value.equals("Umesh") }
    println(checkResult6)




}




class MapInterfaceFilter {
}