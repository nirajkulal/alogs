package com.study.algos.code.vector

object RotateMatrix {
    /**
     * Rotate matrix by 90 degree
     */
    fun rotateMatrix(input: Array<Array<Int>>, n: Int) {
        /**
         * 1) Get transpose matrix
         * 2) swap end columns
         */
        print("\n Algorithms Rotate matrix ")
        for (i in 0 until n) {
            for (j in 0 until n) {
                print("${input[i][j]} ")
            }
            print("\n Algorithms Rotate matrix ")
        }
        transposeMatrix(input, n)
        swapLastCols(input, n)
        print("\n Algorithms Rotated matrix ")
        for (i in 0 until n) {
            for (j in 0 until n) {
                print("${input[i][j]} ")
            }
            print("\n Algorithms Rotated matrix ")
        }
    }

    /**
     *Swap cols start by end
     */
    private fun swapLastCols(input: Array<Array<Int>>, n: Int) {
        var start = 0
        var end = n - 1
        while (start < end) {
            for (j in 0 until n) {
                arraySwap(input, start, j, end, j)
            }
            start++
            end--
        }
    }

    /**
     * Swap other than diagonal [i==j]
     */
    private fun transposeMatrix(input: Array<Array<Int>>, n: Int) {
        for (i in 0 until n) {
            /**
             * J starts from i to avoid reverse swapping
             */
            for (j in i until n) {
                /**
                 * Skip diagonal
                 */
                if (i != j) {
                    arraySwap(input, i, j, j, i)
                }
            }
        }
    }
}

fun arraySwap(input: Array<Array<Int>>, i: Int, j: Int, m: Int, n: Int) {
    val temp = input[i][j]
    input[i][j] = input[m][n]
    input[m][n] = temp
}