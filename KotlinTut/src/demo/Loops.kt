import java.util.Random

fun main(args: Array<String>) {

    // loop 1..10
    for(x in 1..10) {
        println("Loop : $x")
    }

    // random
    val rand = Random()
    val magicNum = rand.nextInt(50) + 1

    var guess = 0

    // loop until magicNum == guess
    while(magicNum != guess) {
        guess += 1
    }

    println("Magic Number was $guess")

    // loop 1..20
    for(x in 1..20) {
        if (x % 2 == 0) { // skip even number
            continue
        }

        // print odd number
        println("Odd : $x")

        // break loop
        if (x == 15) break
    }

    var array3: Array<Int> = arrayOf(3,6,9)

    for(i in array3.indices) { // i index of array
        println("Mult 3: ${array3[i]}")
    }

    // print index and value
    for((index, value) in array3.withIndex()) {
        println("Index $index Value $value")
    }

}