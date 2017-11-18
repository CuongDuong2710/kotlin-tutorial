package demo

/**
 * Created by QUOC CUONG on 18/11/2017.
 */

fun main(args : Array<String>) {

    val numList = 1..20

    // sum all values in list
    val listSum = numList.reduce{ x, y -> x + y }
    println("Reduce sum : $listSum") //Reduce sum : 210

    // fold is going to start off with an initial value of 5
    val listSum2 = numList.fold(5) {x, y -> x + y}
    println("Fold sum : $listSum2") //Fold sum : 215

    // check any number is even
    println("Evens: ${numList.any { it % 2 == 0 }}") //Evens: true

    // check all number is even
    println("Evens: ${numList.all { it % 2 == 0 }}") //Evens: false

    // filter number > 3
    val big3 = numList.filter { it > 3 }
    big3.forEach { n -> println(">3: $n") }

    // map: is going to allow you perform an action on every single item
    // and then return a new list
    val time7 = numList.map { it * 7 }
    time7.forEach { n -> println("*7: $n") }
}
