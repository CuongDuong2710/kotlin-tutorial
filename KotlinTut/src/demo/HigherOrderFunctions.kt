package demo

/**
 * Created by QUOC CUONG on 18/11/2017.
 */

fun main(args : Array<String>) {

    // list from 1 -> 20
    val numList = 1..20

    // filter even number
    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach { n -> println(n) }

    // return a function
    val mult3 = makeMathFunc(3)
    // and receive '5' integer
    println("5 * 3 = ${mult3(5)}") // 5 * 3 = 15

    // math on list
    val multiply2 = {num1: Int -> num1 * 2}

    val numList2 = arrayOf(1,2,3,4,5)

    mathOnList(numList2, multiply2)

    /*MathOnList 2
    MathOnList 4
    MathOnList 6
    MathOnList 8
    MathOnList 10*/
}

// return dynamically a function - and this function receive integer parameter (Int)
fun makeMathFunc(num1: Int): (Int) -> Int = {num2 -> num1 * num2}

// function as parameter
fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int) {
    for (num in numList) {
        println("MathOnList ${myFunc(num)}")
    }
}
