package com.study.algos.code.multidimarray

object SubMatrixSum {

    /**
     * Given a matrix of size M x N, there are large number of queries to find submatrix sums.
     * Inputs to queries are left top and right bottom indexes of submatrix whose sum is to find out.
     */
    fun subMatrixSum(
        input: Array<Array<Int>>,
        r: Int,
        c: Int,
        startR: Int,
        startC: Int,
        endR: Int,
        endC: Int
    ) {
        val aux: Array<Array<Int>> = getAuxiliaryMatrix(input, r, c)

        /**
         * Get total sum then remove top part and left part. common area needs to be added again
         * as it is removed twice
         *
         */
        val totalSum = aux[endR][endC]

        /**
         * get top part
         *
         * if start Row is 0 then there wont be any top part and common to remove from total
         *
         */
        val topSum = if (startR > 0) aux[startR - 1][endC] else 0

        /**
         * get Left part
         *
         * If start Column is 0 then no need of removal of left and common part. only top part will be
         * available to remove
         */
        val leftSum = if (startC > 0) aux[endR][startC - 1] else 0

        /**
         * Common area
         */
        val commonArea = if (startC > 0 && startR > 0) aux[startR - 1][startC - 1] else 0
        val output = totalSum - (topSum + leftSum) + commonArea
        println("Algorithms SubMatrixSum of ($startR,$startC) and ($endR,$endC) -> $output ")
    }

    /**
     * Create auxiliary matrix has sum to the given point
     */
    private fun getAuxiliaryMatrix(
        input: Array<Array<Int>>,
        m: Int,
        n: Int
    ): Array<Array<Int>> {
        val auxiliaryMatrix: Array<Array<Int>> = Array(m) { Array(n) { 0 } }
        for (i in 0 until m)
            for (j in 0 until n) {
                when {
                    i == 0 && j == 0 -> {
                        /**
                         * First element does not have previously calculated sum
                         */
                        auxiliaryMatrix[i][j] = input[i][j]
                    }
                    i == 0 -> {
                        /**
                         * First row does not have previously calculated top
                         */
                        auxiliaryMatrix[i][j] = input[i][j] + auxiliaryMatrix[i][j - 1]
                    }
                    j == 0 -> {
                        /**
                         * First column does not have previously calculated left
                         */
                        auxiliaryMatrix[i][j] = input[i][j] + auxiliaryMatrix[i - 1][j]
                    }
                    else -> {
                        /**
                         * Sum = left + top - [1-i][j-1]
                         */
                        auxiliaryMatrix[i][j] =
                            input[i][j] + auxiliaryMatrix[i - 1][j] + auxiliaryMatrix[i][j - 1] - (auxiliaryMatrix[i - 1][j - 1])
                    }
                }

            }
        return auxiliaryMatrix
    }

}