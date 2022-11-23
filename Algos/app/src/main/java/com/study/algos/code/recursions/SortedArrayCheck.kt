package com.study.algos.code.recursions

object SortedArrayCheck {

    fun checkArraySorted(input: Array<Int>) {
        println("Algorithms checkArraySorted ${checkSortedRec(input, 0)}")
    }

    private fun checkSortedRec(input: Array<Int>, currentIndex: Int): Boolean {
        if (input.size - 1 == currentIndex) {
            return true
        }
        return input[currentIndex] <= input[currentIndex + 1] && checkSortedRec(
            input,
            currentIndex + 1
        )
    }
}