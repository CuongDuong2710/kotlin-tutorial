package demo

/**
 * Created by QUOC CUONG on 18/11/2017.
 */

fun main(args : Array<String>) {

    // adding
    fun add(num1: Int, num2: Int) : Int = num1 + num2
    println("5 + 4 = ${add(5, 4)}")

    // subtracting
    fun subtract(num1: Int = 1, num2: Int = 1) = num1 - num2
    println("5 - 4 = ${subtract(5, 4)}")

    println("4 - 5 = ${subtract(num2 = 5, num1 = 4)}")

    // printing string
    fun sayHello(name: String) : Unit = println("Hello $name")
    sayHello("Paul")

    // returning pair value
    val (two, three) = nextTwo(1)
    println("1 $two $three")

    // getting sum
    println("Sum = ${getSum(1,2,3,4,5)}")

    // multiplying
    val multiply = {num1: Int, num2: Int -> num1 * num2}
    println("5 * 3 = ${multiply(5,3)}")

    // recursion
    println("5! = ${fact(5)}")
}

// returning pair value
fun nextTwo(num: Int) : Pair<Int, Int> {
    return Pair(num + 1, num + 2)
}

// looping in vararg
fun getSum(vararg nums: Int) : Int {
    var sum = 0

    // n is value of element
    nums.forEach { n -> sum += n }

    return sum
}

// tailrec - marks a function as tail-recursive
// (allowing the compiler to replace recursion with iteration)
fun fact(x: Int): Int {
    tailrec fun factTail(y: Int, z: Int): Int {
        if (y == 0) return z
        else return factTail(y - 1, y * z) // 5 * 4 * 3 * 2 * 1
    }
    return factTail(x, 1)
}