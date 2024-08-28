fun main() {
    //predefined functions
    println("eMobilis")

    var squareroot = Math.sqrt(81.0)
    println("The squareroot is $squareroot")

    var round = Math.round(32.67)
    println("The result is $round")

    var myceil = Math.ceil(45.21)
    println("The output value is $myceil")

    day()
    add()
    student("Olivia", 18)
    student("joy", 18)
}



    //user-defined functions

fun day(){
    println("Today is Tuesday")

}
fun add(){
    var num1 = 56
    var num2 = 100
    println(num1 + num2)
}

// parameter and arguments
fun student(name:String, age:Int){
    println("$name is $age years old")

}
