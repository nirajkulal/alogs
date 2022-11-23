package com.study.algos.code.recursions

object Factorial {

    fun factorial(number: Int){
        println("Algorithms factorial of $number is  ${factorialRec(number)}")
    }

    private fun factorialRec(number: Int): Int {
        if (number == 0)
            return 1
        return number * factorialRec(number - 1)
    }


}