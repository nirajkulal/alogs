package com.study.algos.code.multidimarray

object PascalsTriangle {

    /**
     *          1              -> 0
     *        1   1            -> 1
     *       1  2  1           -> 2
     *     1  3   3   1        -> 3
     *   1  4   6   4   1      -> 4
     *
     *
     * sum of previous left and right
     *
     */
    fun pascalsTriangle(depth: Int) {
        val output = Array(depth) { Array(depth) { "" } }
        for (i in 0 until depth) {
            for (j in 0..i) {
                when (j) {
                    /**
                     * First value is always 1
                     */
                    0 -> {
                        output[i][j] = "1"
                    }
                    /**
                     * Ith Value is always 1
                     */
                    i -> {
                        output[i][j] = "1"
                    }
                    /**
                     * Sum of top left and right
                     */
                    else -> {
                        output[i][j] =
                            (output[i - 1][j].toInt() + output[i - 1][j - 1].toInt()).toString()
                    }
                }
            }
        }
        var outString = "\n Algorithms "
        for (i in 0 until depth) {
            for (j in 0 until depth) {
                outString += " ${output[i][j]}"
            }
            outString += "\n Algorithms"
        }
        print("Algorithms Pascal Triangle of $depth -> $outString ")

    }
}
