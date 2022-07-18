package kotlin_program.data_classes

//defining data class and its method  -> toString(), hashCode() and copy()  ....

data class Data_Class2(
    val id: Int,
    val fName: String,
    val lName: String,
    var age: Int
    )

fun main(args: Array<String>){

    var obj1 = Data_Class2(1,"pritam", "patidar", 22)
    val obj2 = Data_Class2(2,"pratyush", "patidar", 23)
    val obj3 = Data_Class2(3,"rohit", "patidar", 25)
    val obj4 = Data_Class2(4,"ajay", "patidar", 27)
    val obj5 = Data_Class2(5,"shashank", "patidar", 21)

    // copy() method is predifined method in kotlin data class for copy one object
    // ->  to another empty object.

    var obj6 = obj1.copy()
//    obj6.age = 25

    // toString method

    println(obj1.toString())
    println(obj2.toString())
    println(obj3.toString())
    println(obj4.toString())
    println(obj5.toString())
    println(obj6.toString())

    //equals() method
    println()
    println(obj1.equals(obj6))
    println(obj2.equals(obj5))


    //hashCode() method return objects hashcode...
    println()
    println(obj1.hashCode())
    println(obj6.hashCode())
    println(obj2.hashCode())
    println(obj4.hashCode())


}

