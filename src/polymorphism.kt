
//Parent class
open class Shape{
   open fun draw(){
        println("Draw a shape")
    }
}
//Child class
open class Rectangle:Shape(){
    override fun draw(){
        println("Draw a rectangle")
    }
}
open class circle{
   fun draw(){
        println("Draw a circle")
    }
}
fun main(){
    var myshape = Shape()
    myshape.draw()

    var myrectangle = Rectangle
    myrectangle.draw()

    var mycircle = circle
    mycircle.draw
}
