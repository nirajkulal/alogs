package com.study.algos.code.util

fun printArrayAsString(array: Array<Int>,message :String){
    var arrayAsString = ""
    for (i in array.indices) {
        arrayAsString += " ${array[i]},"
    }
    println("$message $arrayAsString")
}
data class Points(var x: Int, var y: Int)