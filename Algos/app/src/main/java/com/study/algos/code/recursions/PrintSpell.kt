package com.study.algos.code.recursions

object PrintSpell {

    fun printSpell(number: Int) {
        if (number == 0) {
            return
        }

        val num = number % 10
        printSpell(number / 10)
        println("Algorithms print spell $num")
    }
}
