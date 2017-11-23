package demo

/**
 * Created by QUOC CUONG on 23/11/2017.
 */

fun main(args : Array<String>) {

    val divisor = 0

    try {
        if (divisor == 0) {
            throw IllegalArgumentException("Can't Divide by Zero")
        } else {
            println("5 / $divisor = ${5/divisor}")
        }
    } catch(e: IllegalArgumentException){
        println("message: ${e.message}")
    }

}
