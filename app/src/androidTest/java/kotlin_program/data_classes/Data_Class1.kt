package kotlin_program.data_classes

// defining data class in kt  using toString() method and equals() method ....

fun main(args: Array<String>){

    val obj1: Data_Class1 = Data_Class1("Rohit",22)
    val obj2 = Data_Class1("Pankaj Kumar", 30)
    val obj3 = Data_Class1("Pankaj Kumar", 30)
    val obj4 = Data_Class1("Rahul Kumar", 40)


    // toString() method is used to convert values into the string and returns it to object.... ///

    println(obj1.toString())
    println(obj2.toString())
    println(obj3.toString())
    println(obj4.toString())


    // equals() method is used to compare to object value's if equal then returns true
    // ->  else return false

    println(obj1.equals(obj2))
    println(obj2.equals(obj3))
    println(obj3.equals(obj1))


}

data class Data_Class1(
    val name: String,
    val age: Int )