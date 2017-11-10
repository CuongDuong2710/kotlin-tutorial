package demo

/**
 * Created by QUOC CUONG on 10/11/2017.
 */

fun main(args: Array<String>) {

    // string read-only
    val myName = "Derek Banas"

    // long string can enter down line
    val longStr = """ This is a
long string """

    // mutable string
    var fName: String = "Doug"
    var lName: String = "Smith"

    // change fName
    fName = "Sally"

    var fullName = fName + " " + lName

    println("Name : ${fullName}") //Name : Sally Smith

    // can place operation in curly braces
    println("1 + 2 = ${1 + 2}") // 1 + 2 = 3

    // length
    println("String length : ${longStr.length}") // String length : 23

    // Upper and lower case
    var str1 = "A random string"
    var str2 = "a random string"

    // equals
    println("Strings Equal : ${str1.equals(str2)}") // Strings Equal : false

    // equals ignore case
    println("Strings Ignore Case : ${str1.equals(str2, true)}")  // Strings Equal Ignore Case : true

    // compare string
    println("Compare A to B : ${"A".compareTo("B")}") // Compare A to B : -1

    // get string at index
    println("2nd Index : ${str1[2]}") // 2nd Index : r

    // get string from 2 - 7
    println("Index 2 - 7 : ${str1.subSequence(2, 8)}") // Index 2 - 7 : random

    // check contain
    println("Contains random : ${str1.contains("random")}") // Contains random : true
}
