package com.study.algos.code.sorting

import com.study.algos.code.util.printArrayAsString

object BubbleSort {

    /**
     * Each each outer iteration bigger element moved to the end other words sorting happens from the end
     *
     */
    fun bubbleSort(array: Array<Int>) {
        /**
         * size-1-1 iterations as each iteration creates i sorted array so there by eliminating the need
         * of last iteration as it will sorted by then.
         */
        for (i in 0 until array.size - 1) {
            /** Swap unsorted array till [size-1-i-1] as i the sorted array size and additional -1 as
             *  we comparing with next element and swapping, so iteration will one lesser than [size-1-i]
             */
            for (j in 0 until array.size - i - 1) {
                if (array[j] > array[j + 1]) {
                    val temp = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = temp
                }
            }
        }

        printArrayAsString(array,"Algorithms sorted array using bubble sort")
    }

    fun bubbleSortOptimised(array: Array<Int>) {
        /**
         * size-1-1 iterations as each iteration creates i sorted array so there by eliminating the need
         * of last iteration as it will sorted by then.
         */
        for (i in 0 until array.size - 1) {
            /** Swap unsorted array till [size-1-i-1] as i the sorted array size and additional -1 as
             *  we comparing with next element and swapping, so iteration will one lesser than [size-1-i]
             */

            /**
             * Use flag to check inner loop swap, if no swap takes place then its sored
             */
            var isSwapped = false
            for (j in 0 until array.size - i - 1) {
                if (array[j] > array[j + 1]) {
                    isSwapped = true
                    val temp = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = temp
                }
            }

            if (!isSwapped)
                break
        }

        printArrayAsString(array,"Algorithms sorted array using opt bubble sort")
    }
}