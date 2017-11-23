package demo

/**
 * Created by QUOC CUONG on 23/11/2017.
 */

fun main(args: Array<String>) {
    // allow null
    /*var nullVar: String? = null

    fun returnNull(): String? {
        return null
    }

    var nullVar2 = returnNull()

    if (nullVar != null) {
        println("nullVar.length")
    }

    var nullVar3 = nullVar!!.length

    var nullVal4: String = returnNull() ?: "No name"*/

    var a: String = "abc"
    //a = null // compilation error
    //println("a: $a")
    println("a.length: ${a.length}") // a.length: 3

    // allow null
    var b: String? = "abc"
    b = null
    println("b: $b") // b: null
    // println("b: ${b.length}") // error: variable 'b' can be null

    // How to call b

    // 1. checking for null in conditions

    // a.
    val l = if (b != null) b.length else -1
    println("l is $l") // l is -1

    // b.
    if (b != null && b.length > 0) {
        println("String of length ${b.length}")
    } else {
        println("Empty string")
    }

    // 2. Safe Calls
    // a. ?.
    println("b.length is ${b?.length}") // returns b.length if b is not null, and null otherwise
    // b.length is null

    // Safe calls are useful in chains.
    // bob?.department?.head?.name

    // b. let
    val listWithNulls: List<String?> = listOf("A", null)
    for (item in listWithNulls) {
        item?.let { println(it)} // prints A and ignores null
    } // A

    // 3. Elvis Operator

    // val l = if (b != null) b.length else -1
    val l1 = b?.length ?: -1 //If the expression to the left of ?: is not null, the elvis operator returns it,
    // otherwise it returns the expression to the right. Note that the right-hand side expression is evaluated only if the left-hand side is null.

    // 4. The !! Operator
    //val l2 = b!!.length // this will return a non-null value of b (e.g., a String in our example) or throw an NPE if b is null
    //println("l2 is $l2") // throw exception error

    // 5. Safe casts
    // val aInt: Int? = a as? Int

    // 6. Collections of Nullable Type
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val initList: List<Int> = nullableList.filterNotNull()

    initList.forEach { n -> println(n) }
}
