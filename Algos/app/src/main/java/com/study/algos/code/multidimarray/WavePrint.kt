package com.study.algos.code.multidimarray

object WavePrint {
    /**
     * [
     * [1  2  3  4 ]
     * [5  6  7  8 ]
     * [9  10 11 12]
     * [13 14 15 16]
     *
     * Output ->[4 8 12 16 15 11 7 3 2 6 10 14 13 9 5 1]
     */

    fun wavePrint(input: Array<IntArray>, r: Int, c: Int) {
        /**
         * This can be achieved by starting traversal of column at the end and alternatively
         * changing row direction.
         */
        var output = ""
        /**
         * J is loop for column which will be decreasing as wave starts at the end of of array
         */
        for (j in (c - 1) downTo 0) {
            /**
             * Detect direction for wave, alternate direction is used by managing 'for loop' direction
             *
             */
            if (j % 2 == 1) {
                for (i in 0 until r) {
                    output += "  " + input[i][j] + " "
                }
            } else {
                for (i in (r - 1) downTo 0) {
                    output += "  " + input[i][j] + " "
                }
            }
        }
        println("Algorithms wave print  -> $output")
    }
}