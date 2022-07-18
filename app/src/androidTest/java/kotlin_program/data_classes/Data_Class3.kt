package kotlin_program.data_classes

data class Data_Class3(
    var name: String,
    var age: Int
){
    var height: Int = 0
}

fun main(args: Array<String>){
    val obj = Data_Class3(" Rohit Sharma ",40)
    val obj1 = Data_Class3(" Shekhar ",38)
    val obj2 = Data_Class3(" Rohit Sharma ",45)

    // change single value in a constructor in data class object using copy function...
    val obj3 = obj.copy(name = "virat kohli")

    println(obj.toString())
    println(obj1.toString())
    println(obj2.toString())
    println(obj3.toString())


//    asigning value directly using objectName and dot operator then var/val name...

    println()
    obj.age =50

    println(obj.toString())

    obj.height = 100
    println("Height is : ${obj.height} cm")


}