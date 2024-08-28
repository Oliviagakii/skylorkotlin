
import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)
    println("Enter first number: ")
    val firstNumber = input.nextInt()
    println("Enter second number: ")
    val secondNumber = input.nextInt()
    println("Enter Action (+,-,*, /, %):")
    val choice = input.next()[0]
    val result = when (choice) {
        '+' -> firstNumber + secondNumber
        '-' -> firstNumber - secondNumber
        '*' -> firstNumber * secondNumber
        '/' -> firstNumber / secondNumber
        '%' -> firstNumber % secondNumber
        else ->{
            System.err.println("Not a valid operation")
            return
        }
    }
    println(result)
}