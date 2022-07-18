package kotlin_program.lambda_expression


fun main(args: Array<String>){
    val obj:LambdaExpression1 = LambdaExpression1()
    val result = obj.square(10)
    println(result)
}

class LambdaExpression1 {

    val square = { number: Int ->  number * number }

}


