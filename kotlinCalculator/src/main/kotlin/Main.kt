import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    var initiall = 1
    /*println(inputOne)
    println(operator)
    println(inputTwo)*/ //testing
    println("kotlin calculator, programmed by rian, enter 0 to exit\n\n")
    while(initiall == 1){
        val inputOne: Int = scanner.nextInt()
        val operator = scanner.next()
        val inputTwo: Int = scanner.nextInt()
        if (operator == "+"){
            println(inputOne + inputTwo)
        }
        else if (operator == "-"){
            println(inputOne - inputTwo)
        }
        else if (operator == "x"){
            println(inputOne * inputTwo)
        }
        else if (operator == "/"){
            println(inputOne / inputTwo)
        }
        else if (operator == "%"){
            println(inputOne % inputTwo)
        }
        else if (inputOne == 0){
            initiall = 0
        }
    }
}