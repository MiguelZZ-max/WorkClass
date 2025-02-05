package com.example.workclass

//class variables {
//}

fun main(){
    //Numeric variables
    val age:Int =23
    val long_number:Long = 789123128937
    val temperature:Float = 27.33f
    val weight:Double = 64.1231

    //String variables
    val gender:Char = 'M'
    val name:String = "Miguel Angel"

    //Bool variables
    val isGreater:Boolean = false

    //Collection variables
    val names = arrayOf("Miguel", "Sofia", "Javier", "Veronica")

    println(age)

    println("Welcome $name, to your first Kotlin project")
    println(add())
    println(product(5,8))
    printarray(names)

}
fun add ():Int{

    val x = 10
    val y = 5

    return(x+y)

}

fun product(x:Int, y:Int):Int{

    return(x+y)
}

fun printarray(names: Array<String>){
    println(names)
    for (name in names){
        println("Hello $name")

    }

}