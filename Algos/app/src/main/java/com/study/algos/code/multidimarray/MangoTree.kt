package com.study.algos.code.multidimarray

import kotlin.math.min

object MangoTree {
    data class Point(var x: Int = -1, var y: Int = -1)
    data class Trees(var q1: Int = 0, var q2: Int = 0, var q3: Int = 0, var q4: Int = 0)

    /**
     * Divide a matrix on a point such that minimum is maximum
     * Aux matrix is used to get sum of total trees up to any given point
     */
    fun mangoTree(input: Array<Array<String>>, m: Int, n: Int) {
        val auxiliaryMatrix: Array<Array<Int>> = getAuxiliaryMatrix(input, m, n)

        var maximisedMin = Int.MIN_VALUE
        val point = Point()

        for (i in 0 until m)
            for (j in 0 until n) {
                val trees = getTreeCount(auxiliaryMatrix, i, j, m, n)
                val maxMin = min(min(trees.q1, trees.q2), min(trees.q3, trees.q4))
                if (maximisedMin < maxMin) {
                    maximisedMin = maxMin
                    point.x = i
                    point.y = j
                }
            }
        println("Algorithms Minimum mango tree  -> $maximisedMin")
    }

    /**
     * Get tree count using Aux matrix
     */
    private fun getTreeCount(
        auxiliaryMatrix: Array<Array<Int>>,
        i: Int,
        j: Int,
        m: Int,
        n: Int
    ): Trees {
        val trees = Trees()
        /**
         * Same as aux count at this point
         */
        trees.q1 = auxiliaryMatrix[i][j]
        /**
         * Take sum from X axis end and remove Q1
         */
        trees.q2 = auxiliaryMatrix[i][n - 1] - trees.q1
        /**
         * Take sum from Y axis end and remove Q1
         */
        trees.q3 = auxiliaryMatrix[m - 1][j] - trees.q1
        /**
         * Take sum from Last point end and remove Q1,Q2 and Q3
         */
        trees.q4 = auxiliaryMatrix[m - 1][n - 1] - (trees.q1 + trees.q2 + trees.q3)
        return trees
    }

    /**
     * Create auxiliary matrix has sum of mango tree to the given point
     */
    private fun getAuxiliaryMatrix(
        input: Array<Array<String>>,
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
                        auxiliaryMatrix[i][j] = isTree(input, i, j)
                    }
                    i == 0 -> {
                        /**
                         * First row does not have previously calculated top
                         */
                        auxiliaryMatrix[i][j] = isTree(input, i, j) + auxiliaryMatrix[i][j - 1]
                    }
                    j == 0 -> {
                        /**
                         * First column does not have previously calculated left
                         */
                        auxiliaryMatrix[i][j] = isTree(input, i, j) + auxiliaryMatrix[i - 1][j]
                    }
                    else -> {
                        /**
                         * Sum = left + top - [1-i][j-1]
                         */
                        auxiliaryMatrix[i][j] =
                            isTree(
                                input,
                                i,
                                j
                            ) + auxiliaryMatrix[i - 1][j] + auxiliaryMatrix[i][j - 1] - (auxiliaryMatrix[i - 1][j - 1])
                    }
                }

            }
        return auxiliaryMatrix
    }

    /**
     * Return 1 if tree present at current point
     */
    private fun isTree(input: Array<Array<String>>, i: Int, j: Int): Int = if (input[i][j] == "#")
        1
    else 0
}
