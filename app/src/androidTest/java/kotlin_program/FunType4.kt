package kotlin_program

//11 type function
fun main(args: Array<String>) {
    val obj: FunType4 = FunType4()

    println("enter a last Number: ")
    val lastNum = Integer.parseInt(readLine())


    val result:Int = obj.naturalNumSum(lastNum)
    println("natural number some from 1 to $lastNum is : $result")
}

class FunType4 {
    fun naturalNumSum(lastNum: Int): Int{

        //    formula natural numSum = n(a+l)/2   // a will be 1 only here.
        val naturalSum = lastNum * (1 + lastNum)/2
        return naturalSum
    }

}