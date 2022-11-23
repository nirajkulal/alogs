package com.study.algos.code.binarysearch

object BinarySearch {

    fun binarySearch(array: Array<Int>, item: Int): Int {

        var firstIndex = 0
        var lastIndex = array.size - 1

        while (firstIndex <= lastIndex) {
            //Get mid index
            val midIndex = (firstIndex + lastIndex) / 2
            val itemIndex = isMidItem(array, midIndex, item)
            //if item index not -1 found index
            if (itemIndex != -1)
                return itemIndex
            if (item < array[midIndex]) {
                //Item is in first part of the array
                lastIndex = midIndex - 1
            } else {
                //Item is in second part of the array
                firstIndex = midIndex + 1
            }
        }
        //Item not found
        return -1
    }

    //return -1 if mid is not expected item
    private fun isMidItem(array: Array<Int>, midIndex: Int, item: Int): Int {
        return if (array[midIndex] == item) midIndex else -1
    }

}