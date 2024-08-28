class Dog(var name:String, var breed:String, var age:Int)

fun main(){
    var dog1 = Dog("Tito", "German Shepherd", 6)
    println(dog1.name + dog1.breed)
    var dog2 = Dog("Bob", "Kienyeji", 4)
    println(dog2.name + dog2.age)

    var dog3 = Dog("Simba", "Chiwawa", 5)
    println(dog3.name + dog3.age)
}