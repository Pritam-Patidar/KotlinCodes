package kotlin_program


fun main(args: Array<String>) {

    val obj: WhileLoopCode = WhileLoopCode()
    var names: Array<String> = arrayOf("Pritam","lokesh","Ajay","Mritunjay","Abhi")

    var index = 0
    obj.iterateValueOfArrayObj(names,index)

}


class WhileLoopCode {
    fun iterateValueOfArrayObj(arr: Array<String>, index:Int){
        var ind = index
        while(ind < arr.size){
            println(arr[ind])
            ind++
        }
    }
}