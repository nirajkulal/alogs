package com.study.algos.code.sorting

import com.study.algos.code.util.printArrayAsString

object CountingSort {

    /**
     * Use counter array to store frequency and update current array using counter array based on
     * frequencies
     */
    fun countingSort(array: Array<Int>) {
        var upperRange = Int.MIN_VALUE
        /**
         * Get maximum range that is maximum item in the array
         */
        for (i in array.indices) {
            if (array[i] > upperRange) {
                upperRange = array[i]
            }
        }

        var countingArray = IntArray(upperRange + 1) { 0 }
        /**
         * Update Counter array with frequencies
         */
        for (i in array.indices) {
            countingArray[array[i]] = countingArray[array[i]] + 1
        }
        var arrayPos = 0
        /**
         * Update array using counter array based on frequencies
         */
        for (i in countingArray.indices) {
            var counter = countingArray[i]
            while (counter > 0) {
                array[arrayPos] = i
                arrayPos++
                counter--
            }
        }
        printArrayAsString(array, "Algorithms sorted array using Counting sort")
    }
}