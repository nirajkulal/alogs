package com.study.algos.code.sorting

import com.study.algos.code.util.printArrayAsString

object InsertionSort {

    /**
     * Each iteration insert the current unsorted item to the sorted array[Like cards]
     */
    fun insertionSort(array: Array<Int>) {

        /**
         * By default consider first element as sorted so start loop from 1
         * Compare current element with the sorted index if it is greater move one position making place
         * to the unsorted element also making array sorted until sorted index becomes less than zero,
         * or no greater elements found that means no need to check further as this part of array is sorted
         *
         * Push the current unsorted element to the last sorted index. [sorted index to get the position for
         * current element]
         */
        for (i in 1 until array.size) {
            val currentUnsorted = array[i]
            var sortedIndex = i - 1
            while (sortedIndex >= 0) {
                if (array[sortedIndex] > currentUnsorted) {
                    array[sortedIndex + 1] = array[sortedIndex]
                } else {
                    /**
                     * array is sorted
                     */
                    break
                }
                sortedIndex--
            }
            /**
             * Found position, place unsorted element
             */
            array[sortedIndex + 1] = currentUnsorted
        }

        printArrayAsString(array,"Algorithms sorted array using insertion sort")
    }
}