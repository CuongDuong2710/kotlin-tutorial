package mydemo

/**
 * Created by QUOC CUONG on 25/07/2017.
 */

fun sum(a: Int, b: Int) = a + b

fun printSum(a: Int, b:Int): Unit {
    println("sum of $a and $b is ${a + b}")
}
/** if...else */
fun maxOf(a: Int, b: Int) = if (a > b) a else b

/** parseInt */
fun parseInt(s: String): Int? {
    return s.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    /*if (x != null && y != null) {
        println(x * y)
    } else {
        println("either '$arg1' or '$arg2' is not a number ")
    }*/

    if (x == null) {
        println("Wrong number format in arg1: $arg1 ")
        return
    }
    if (y == null) {
        println("Wrong number format in arg1: $arg2 ")
        return
    }
    println(x * y)
}
/** getStringLength */
fun getStringLength(obj: Any): Int? {
    if (obj is String)
        return obj.length

    return null

    /*if (obj !is String)
        return null

    return obj.length*/

    /*if (obj is String && obj.length > 0)
        return obj.length

    return null*/
}

fun printLength(obj: Any) {
    println("'$obj' string length is ${getStringLength(obj) ?: "... err, not a string"}")
}
/** when */
fun describe(obj: Any): String =
        when (obj) {
            1           -> "One"
            "Hello"     -> "Greeting"
            is Long   -> "Long"
            !is String  -> "Not a String"
            else        -> "Unknown"
        }

fun chia(a: Int, b: Int) : Int {
    if (b == 0)
        throw Exception("Mau so = 0")
    return a/b
}

fun main(args: Array<String>) {

    /**bat loi*/
    try {
        chia(5, 0)
    } catch (e : Exception) {
        println(e.message)
    }
    println("Cam on")

    /** ranges */
    val x = 10
    val y = 9
    if (x in 1 .. y + 1)
        println("fits in range")

    val list = listOf("a", "b", "c")

    if(-1 !in 0 .. list.lastIndex)
        println("-1 is out of range 0.. ${list.lastIndex}")

    if(list.size !in list.indices)
        println("${list.size} is out of valid ${list.indices} range too")

    for (x in 1..5)
        print(x)

    for (x in 1..10 step 2)
        print(x)

    for (x in 9 downTo 0 step 3)
        print(x)

    //Checking if a collection contains an object using in operator:
    val items1 = listOf("apple", "banana", "kiwi", "avocado")
    println()
    when {
        "orange" in items1 -> println("juicy")
        "apple" in items1 -> println("apple is fine too")
    }

    items1
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }

    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    for ((k, v) in map) {
        println("$k -> $v")
    }
    println(map["a"])

    /** when */
    /*println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("abc"))*/

/** For... while */
   //val items = listOf("apple", "banana", "kiwi")

    /*for (item in items) {
        println(item)
    }*/

    /*for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }*/

    /*var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }*/

/** printLength */
    /*printLength("Incomprehensibilities")
    printLength("")
    printLength(listOf(Any()))*/

    /*printProduct("6", "5")
    printProduct("b", "c")
    printProduct("6", "a")*/

    /*println("sum of 19 and 23 is ${sum(19, 23)}")
    printSum(-1, 8)*/

/** Local variable */
    /*val a: Int = 1
    val b = 2
    val c: Int
    c = 3
    var x = 5;
    x += 1;
    println("a = $a, b = $b, c = $c, x = $x")*/

    /*var a1 = 1
    val s1 = "a is $a1"
    a1 = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a1"
    println(s2)*/

    //println("max of 0 and 12 is ${maxOf(0, 12)}")

    /**nhap chuoi*/
    /*println("Bo nhi ban ten gi? Nhap ten")
    var ten: String? = readLine()
    println(ten)*/

    /**ep kieu*/
    var x1: Long = "100".toLong()
    println(x1)

}
