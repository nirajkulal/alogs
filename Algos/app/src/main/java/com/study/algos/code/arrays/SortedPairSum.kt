package com.study.algos.code.arrays

import kotlin.math.abs

object SortedPairSum {

    fun sortedPair(array: Array<Int>, item: Int) {
        var lIndex = 0
        var rIndex = array.size - 1

        var resultPair1 = 0
        var resultPair2 = 0

        var diff = Int.MAX_VALUE

        /**
         * Use right and left indices, increase or decrease the indices based on sum of the current
         * pair. If the sum is more than item decrease the upper index else increase the lower index
         * because array is sorted.
         */
        while (lIndex < rIndex) {
            if (abs((array[lIndex] + array[rIndex]) - item) < diff) {
                diff = abs((array[lIndex] + array[rIndex]) - item)
                resultPair1 = array[lIndex]
                resultPair2 = array[rIndex]
            }
            if ((array[lIndex] + array[rIndex]) > item) {
                rIndex--
            } else {
                lIndex++
            }
        }
        println("Algorithms sorted pair sum $resultPair1, $resultPair2")

    }

}