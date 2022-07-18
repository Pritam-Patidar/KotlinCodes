package kotlin_program


// 01 type function
fun main(args: Array<String>) {
    val obj: FunType2 = FunType2()

    println("enter length")
    val l = Integer.parseInt(readLine())

    println("enter breadth")
    val b = Integer.parseInt(readLine())

    obj.findArea(l,b)

}


class FunType2 {

    fun findArea(len: Int, bre:Int){

        val area = len * bre
        println("area of rectangle : $area")
    }
}