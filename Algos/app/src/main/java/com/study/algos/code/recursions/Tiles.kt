package com.study.algos.code.recursions

object Tiles {

    /**
     * f(n) = f(n-1)+ f(n-m)
     */
    fun tilesProblem(n: Int, m: Int): Int {
        if (n < m)
            return 1
        val op1: Int = tilesProblem(n - 1, m)
        val op2: Int = tilesProblem(n - m, m)
        return op1 + op2
    }
}