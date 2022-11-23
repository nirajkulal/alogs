package com.study.algos.code.arrays

object Pairs {

    fun pairs(array: Array<Int>) {
        for (i in array.indices) {
            //Until does not include
            for (j in (i + 1) until array.size) {
                println("Algorithms: ${array[i]}, ${array[j]}")
            }
        }
    }
}