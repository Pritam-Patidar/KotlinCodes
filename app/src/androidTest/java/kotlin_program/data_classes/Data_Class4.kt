package kotlin_program.data_classes



data class Data_Class4(
    var name: String,
    var age: Int
){
    fun getUserData() = "user name is : $name and Age is : $age"
}


fun main(args: Array<String>) {

    val obj1: Data_Class1 = Data_Class1("Rohit", 22)
    val obj2 = Data_Class1("Pankaj Kumar", 30)
    val obj3 = Data_Class1("Pankaj Kumar", 30)
    val obj4 = Data_Class1("Rahul Kumar", 40)

    val obj10: String = Data_Class4("Bagesgwar Ji Balaji", 100).getUserData()
    println("calling getUserData() function which is define inside data class:  -> ")
    println(obj10)

    println()
    // without using toString() method we can directly print data of object.... ///

    println(obj1)
    println(obj2)
    println(obj3)
    println(obj4)


    // we can directly compare two object data using == in data class in kotlin and return true or false.
    println()
    println(obj1 == obj2)
    println(obj2 == obj3)
    println(obj3 == obj4)

    println()
    println("cheaking hash value")
    println(obj2.hashCode() == obj3.hashCode())

    /// and we can also assign one object value ibnto another empty object using = asign it.
    println()
    val obj5 = obj1

    println(obj5)


    println()
    /// component() is a predefined method which is used to print single value from data class primary constructor
    println(obj1.component1())
    println(obj1.component2())


}

