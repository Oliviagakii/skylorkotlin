//A string is a collection of characters
fun main(){
    var firstname = "Olivia"
    var lastname = "gakii"

    //Accessing an element in a string
    println(firstname)
    println(firstname[1])

    //Modifying a string
    println(lastname.uppercase())
    println(firstname.lowercase())

    //String concatenation - joining strings
    println(firstname + lastname)
    println(firstname + " " + lastname)
    println(firstname.plus(lastname))

    // string Interpolation
    println("My firstname is" +" "+ firstname)
    println("My firstname is $firstname")

    var num1 = 67
    var num2 = 37
    println("The sum of $num1 and $num2 is" + (num1 + num2))
    




}