fun main(){
    numbers()
    println(students())
    serveDrinks(4)
    serveDrinks(10)
    serveDrinks(20)
    newLine()



}
fun numbers(){
    for(one in 1 ..100){
        if (one%2!=0){
            println(one)
        }
    }
}
fun students(): Int {
    var names = arrayOf("Thomas","Rosemary","Johnpaul","Laura","Jane")
    var countedNames = 0
    for (letter in names) {
        if (letter.length > 5)
            countedNames++
    }
    return countedNames

}

fun serveDrinks(age:Int){
    if (age<6){
        println("serve milk")}
    else if (age<15 && age>6){
        println("Serve fanta orange")
    }

    else{
        println("Serve coca cola")
    }}
fun newLine(){
    for (each in 1..100){
        if (each%3==0){
            println("Fizz")
        }else if(each%5==0){
            println("Buzz")
        }else{
            println(each)
        }

    }
}


