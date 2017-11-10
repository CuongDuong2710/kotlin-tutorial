package demo

/**
 * Created by QUOC CUONG on 10/11/2017.
 */

fun main(args: Array<String>) {

    // range from 1 -> 10
    val oneTo10 = 1..10

    // range from A -> Z
    val alpha = "A".."Z"

    println("R in Alpha: ${"R" in alpha}")

    // 10 -> 1
    val tenTo1 = 10.downTo(1)

    for (x in tenTo1) println("tenTo1: $x")

    // 2 -> 20
    val twoTo20 = 2.rangeTo(20)

    for (x in twoTo20) println("twoTo20: $x")

    // 1 -> 10 step 3
    val range3 = oneTo10.step(3)

    for (x in range3) println("rng3: $x")

    for (x in tenTo1.reversed()) println("Reverse: $x")
}
