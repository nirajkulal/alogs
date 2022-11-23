package com.study.algos.code.recursions

object BinaryProblem {

    /**
     * without consecutive 1s
     * Sample Input
     * 3
     * Sample Output
     * 000
     * 001
     * 010
     * 100
     * 101
     *
     *  if 0 :f(n-1) + if 1 :f(n-2)
     */
    fun binaryProblem(n: Int): Int {
        if (n == 0)
            return 1
        if (n == 1)
            return 1

        return binaryProblem(n - 1) + binaryProblem(n - 2)

    }

}