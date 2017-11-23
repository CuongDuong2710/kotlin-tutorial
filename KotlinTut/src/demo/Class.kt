package demo

/**
 * Created by QUOC CUONG on 23/11/2017.
 */

fun main(args : Array<String>) {

    val bowser = Animal("Bowser", 20.0, 13.5)
    bowser.getInfo()

}

open class Animal(val name: String,
                  var height: Double,
                  var weight: Double) {
    init {
        // checking to see if there is a decimal value anywhere inside of the string
        val regex = Regex(".*\\d+.*")

        require(!name.matches(regex)) {"Animal name can't contain number"}

        require(height > 0) {"Height must be Greater than 0"}
        require(weight > 0) {"Weight must be Greater than 0"}
    }

    open fun getInfo(): Unit {
        println("$name is $height tall and weighs $weight")
    }
}