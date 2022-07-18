package kotlin_program.lambda_expression


/// defining lambda expression using when expression...

fun main(args: Array<String>){

    var obj:LambdaExpression3 = LambdaExpression3()
    var result = obj.calculateGrade(70)
    println("your score is $result")

}
class LambdaExpression3 {


    val calculateGrade = { grade : Int ->
        when(grade) {
            in 0..40 -> "Fail"
            in 41..70 -> "Pass"
            in 71..100 -> "Distinction"
            else -> false
        }
    }
}