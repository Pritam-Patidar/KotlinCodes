package kotlin_program.companionobject



fun main(args: Array<String>) {
    val obj = FunctionPassingAsParameter()
    var lambda = { println("lambda function created.") }

    obj.higherfunc(lambda)         // passing lambda as parameter
}


class FunctionPassingAsParameter {

    fun higherfunc( lmbd: () -> Unit ) {
        lmbd()
    }

}