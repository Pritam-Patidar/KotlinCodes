package kotlin_program.lambda_expression


fun main(args:Array<String>){
    val ref: LambdaExpression2 = LambdaExpression2()
    var resultString: String = ref.returnString(20)
    println(resultString)
}

class LambdaExpression2 {

    val returnString = { input : Int ->
        val mult = input * 100
        mult.toString()
    }

}