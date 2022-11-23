package com.study.algos.code.vector

import com.study.algos.code.util.Points

object MakeZeros {

    fun makeZeros(input: Array<Array<Int>>, m: Int, n: Int) {
        /**
         * Store position temp, as we can not add zeros on runtime due to it add more zeros to
         * current array
         */
        val zeroPosition = ArrayList<Points>()
        for (i in 0 until m)
            for (j in 0 until n) {
                if (input[i][j] == 0)
                    zeroPosition.add(Points(i, j))
            }

        /**
         * Make zeros at the end of loop
         */
        zeroPosition.forEach {
            zeroRowCol(input, it.x, it.y, m, n)
        }

        print("\n Algorithms makeZeros ")
        for (i in 0 until m) {
            for (j in 0 until n) {
                print("${input[i][j]} ")
            }
            print("\n Algorithms makeZeros ")
        }
    }

    /**
     * Make zero of line along with i row and j col
     */
    private fun zeroRowCol(input: Array<Array<Int>>, i: Int, j: Int, m: Int, n: Int) {
        for (rowZero in 0 until n) {
            input[i][rowZero] = 0
        }
        for (colZero in 0 until m) {
            input[colZero][j] = 0
        }
    }
}
