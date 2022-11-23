package com.study.algos.code.arrays

object LowestBound {

    fun lowestBoundByDifference(array: Array<Int>, item: Int) {

        var lowestBoundDifference = Int.MAX_VALUE
        var lowestBound = 0

        //Calculate difference absolute value, lesser the value closer to the item
        for (i in array.indices) {
            if (kotlin.math.abs(array[i] - item) < lowestBoundDifference) {
                lowestBoundDifference = kotlin.math.abs(array[i] - item)
                lowestBound = array[i]
            }
        }
        println("Algorithms lowest Bound By Difference $lowestBound")
    }

    fun lowestBoundByBinarySearch(array: Array<Int>, item: Int) {
        var lowestBound = Int.MAX_VALUE

        var startIndex = 0
        var endIndex = array.size

        var mid: Int
        while ((startIndex <= endIndex)) {
            mid = (startIndex + endIndex) / 2
            if (array[mid] == item) {
                lowestBound = array[mid]
                break
            }
            //store recent mid found, which will be near to the item
            lowestBound = array[mid]
            if (array[mid] > item) {
                endIndex = (mid - 1)
            } else {
                startIndex = (mid + 1)
            }
        }

        println("Algorithms lowest Bound By Difference $lowestBound")
    }
}