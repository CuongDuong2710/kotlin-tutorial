package demo

/**
 * Created by cuong.dnq on 11/13/17.
 */
fun main(args: Array<String>) {
    val age = 8

    // if .. else ..
    if (age < 5) {
        println("Go to Preschool")
    } else if (age == 5) {
        println("Go to Kindergarten")
    } else if ((age > 5) && (age <= 17)) {
        val grade = age - 5
        println("Go to Grage $grade")
    } else {
        println("Go to College")
    }

    // when
    when(age) {
        0,1,2,3,4 -> println("Go to Preschool")

        5 -> println("Go to Kindergarten")

        in 6..17 -> {
            val grade = age - 5
            println("Go to Grage $grade")
        }

        else -> println("Go to College")
    }
}