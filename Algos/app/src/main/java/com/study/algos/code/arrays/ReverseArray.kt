package com.study.algos.code.arrays

object ReverseArray {

    fun reverseArray(array: Array<Int>) {
        var endIndex = array.size - 1
        //Loop to mid swap from start and end
        for (i in 0..(array.size/2)) {
            val temp = array[i]
            array[i] = array[endIndex]
            array[endIndex] = temp
            endIndex--
        }
    }
}