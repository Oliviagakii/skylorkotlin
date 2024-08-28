fun main(){
    for (num in 1..5)
    {
        println("number : $num")
    }
    for (letter in 'a'..'f'){
        println("letter is $letter")
    }
    for(x in 20..25){
        if(x==23){
            break
        }
        println(x)
    }
    for(mynumber in 185..190){
        if(mynumber == 187){
            continue
        }
        println(mynumber)
    }
    
}