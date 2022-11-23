package com.study.algos.code.multidimarray

object SortedArraySearch {

    /**
     * Staircase search:
     * Search is started at top end of array
     * if item is greater than current, search should be continued downwards else leftwards as the
     * array is sorted at row and column
     */
    fun searchSortedArray(input: Array<IntArray>, item: Int, r: Int, c: Int) {
        var i = 0
        var j = c - 1
        var output = "Not found"
        if (input[0][0] <= item && input[r - 1][c - 1] >= item)
            while (i < r && j >= 0) {
                if (input[i][j] == item) {
                    output = " index -> [$i][$j]"
                    break
                }
                if (input[i][j] > item) {
                    /**
                     * Go down
                     */
                    j--
                } else {
                    /**
                     * Go left
                     */
                    i++
                }
            }
        println("Algorithms sorted search $item found at -> $output")

    }

}