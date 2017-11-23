package demo

/**
 * Created by QUOC CUONG on 23/11/2017.
 */

fun main(args : Array<String>) {

    // mutable map with Key(int) and Value(any)
    val map = mutableMapOf<Int, Any?>()

    val map2 = mutableMapOf(1 to "Doug", 2 to 25)

    println("---iterator map2")
    for((x, y) in map2){
        println("Key: $x Value: $y")
    }

    // adding key and value to map
    map[1] = "Derek"
    map[2] = 42

    // map size
    println("---size of map")
    println("Map Size: ${map.size}")

    // putting value to key 3
    map.put(3, "Pittsburgh")

    println("---iterator map before removing")
    for((x, y) in map){
        println("Key: $x Value: $y")
    }

    // removing value at key 2
    map.remove(2)

    println("---iterator map after removing value at key 2")
    for((x, y) in map){
        println("Key: $x Value: $y")
    }

}
