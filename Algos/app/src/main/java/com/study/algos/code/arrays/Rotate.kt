package com.study.algos.code.arrays

import com.study.algos.code.util.printArrayAsString

object Rotate {

    fun rotate(array: Array<Int>, rotate: Int) {
        val rotateV = rotate % array.size

        /**
         * Create a new array by adding values using rotate as offset, append last values to start of
         * new array
         */
        val outArray: Array<Int> = Array(array.size) { 0 }
        for (i in array.indices) {
            if (i <= (array.size - 1 - rotateV)) {
                outArray[rotateV + i] = array[i]
            } else {
                outArray[i - ((array.size - rotateV))] = array[i]
            }
        }

        printArrayAsString(array,"Algorithms rotated array")

    }

}