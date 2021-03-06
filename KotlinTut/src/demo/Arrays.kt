package demo

/**
 * Created by QUOC CUONG on 10/11/2017.
 */

fun main(args: Array<String>) {

    var myArray = arrayOf(1, 1.23, "Doug")

    // print element at index 2
    println(myArray[2])

    // change element at index 1
    myArray[1] = 3.14

    // array length
    println("Array Length : ${myArray.size}") // Array Length : 3

    // check contains
    println("Doug in Array : ${myArray.contains("Doug")}") // Doug in Array : true

    // copy array
    var partArray = myArray.copyOfRange(0, 1)

    // part array
    for (x in partArray) println("partArray ${x}")

    // get element first
    println("First : ${myArray.first()}") // First : 1

    // get element at index 1
    println("Index 1 : ${myArray[1]}") // Index 1 : 3.14

    // get index of specific string
    println("Doug Index : ${myArray.indexOf("Doug")}") // Doug Index : 2

    // creating sqArray with 5 elements and value is x * x
    var sqArray = Array(5, { x -> x * x })

    for (x in sqArray) println("sqArray: ${x}")

    // array with int elements
    var array2: Array<Int> = arrayOf(1, 2, 3)
}
