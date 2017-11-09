/**
 * Created by QUOC CUONG on 09/11/2017.
 */

package demo

fun main(args : Array<String>) {
    println("Hello, world!")

    // assign-once (read-only) local variable
    val name = "Derek"

    // mutable variable
    var myAge = 42

    // assign bigInt to MAX_VALUE
    var bigInt: Int = Int.MAX_VALUE

    // assign smallInt to MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int: " + bigInt) // Biggest Int: 2147483647
    println("Smallest Int: $smallInt") // Smallest Int: -2147483648

    // assign bigLong to MAX_VALUE
    var bigFloat: Float = Float.MAX_VALUE

    // assign smallLong to MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE

    println("Biggest Float: " + bigFloat) // Biggest Float: 3.4028235E38
    println("Smallest Float: $smallFloat") // Smallest Float: 1.4E-45

    // assign bigLong to MAX_VALUE
    var bigDouble: Double = Double.MAX_VALUE

    // assign smallLong to MAX_VALUE
    var smallDouble: Double = Double.MIN_VALUE

    println("Biggest Double: " + bigDouble) // Biggest Double: 1.7976931348623157E308
    println("Smallest Double: $smallDouble") // Smallest Double: 4.9E-324

    var dblNum1: Double = 1.1111111111111111
    var dblNum2: Double = 1.1111111111111111

    println("Sum " + (dblNum1 + dblNum2)) // Sum 2.2222222222222223

    // check true is boolen
    if (true is Boolean) {
        println("true is Boolean\n") // true is Boolean
    }

    // check is character
    var letterGrade: Char = 'A'

    println("A is a Char: ${letterGrade is Char}")
}

