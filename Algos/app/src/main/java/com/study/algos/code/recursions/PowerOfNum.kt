package com.study.algos.code.recursions

object PowerOfNum {
    fun findPower(number: Int, power: Int): Int {
        if (power == 0) return 1
        return number * findPower(number, power - 1)
    }

    fun fastPower(number: Int, power: Int): Int {
        /**
         *   2^8 = 2^4 * 2^4 -> even
         *   2^9 = (2^4 * 2^4)*2 -> odd
         */
        if (power == 0) {
            return 1
        }
        val halfPower = fastPower(number, power / 2)
        val subPower = halfPower * halfPower
        return if (power and 1 == 1) {
            subPower * number
        } else {
            subPower
        }
    }
}