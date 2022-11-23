package com.study.algos.code.sorting

import com.study.algos.code.util.printArrayAsString

object SelectionSort {

    /**
     * Select minimum element from the unsorted and swap with current item, or to the beginning which
     * in terms keeps making sorted array
     */
    fun selectionSort(array: Array<Int>) {
        printArrayAsString(array, "Algorithms to be sorted array using selection sort")
        /**
         * Loop till size-2 as last will be sorted automatically
         */
        for (i in 0 until array.size - 1) {
            var minIndex = i
            /**
             * Find the min item from unsorted part of the array
             */
            for (j in i until array.size) {
                /**
                 * Using array index to compare instead separate min variable
                 */
                if (array[j] < array[minIndex]) {
                    minIndex = j
                }
            }
            /**
             * Swap the min with current element to make item before current position sorted
             */
            val temp = array[i]
            array[i] = array[minIndex]
            array[minIndex] = temp
        }
        printArrayAsString(array, "Algorithms sorted array using selection sort")

    }

}