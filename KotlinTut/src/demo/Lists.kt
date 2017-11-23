package demo

/**
 * Created by QUOC CUONG on 23/11/2017.
 */

fun main(args : Array<String>) {

    // mutable list
    var list1 : MutableList<Int> = mutableListOf(1,2,3,4,5)
    list1.forEach { n -> println("list1 : $n")}

    // immutable list
    val list2 : List<Int> = listOf(1,2,3)

    println("---adding 6---")
    list1.add(6)
    list1.forEach { n -> println("list1 : $n")}

    println("---first, last, 2nd, length---")
    println("1st: ${list1.first()}")
    println("last: ${list1.last()}")
    println("2nd: ${list1[2]}")
    println("Length : ${list1.size}")

    println("--- subList to list3 ---")
    var list3 = list1.subList(0, 3)
    list3.forEach { n -> println("list3 : $n")}
    list1.forEach { n -> println("list1 : $n")}

    println("--- list3.clear() ---")
    list3.clear()
    list1.forEach { n -> println("list1 : $n")}

    println("---remove 1---")
    list1.remove(1)
    list1.forEach { n -> println("list1 : $n")}

    println("---removeAt 1---")
    list1.removeAt(1)
    list1.forEach { n -> println("list1 : $n")}
}