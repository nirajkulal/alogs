package com.study.algos.code.strings

object BinaryToInt {
    fun binaryToInt(input: String) {
        val chars = input.toCharArray()
        var base = 1
        var output = 0
        for (i in chars.size - 1 downTo 0) {
            /**
             * Consider current base, according to the binary input if 0 no need part of addition
             */
            if (chars[i] == '1') {
                output += base
            }
            base *= 2
        }
        println("Algorithms binary to int path of $input is $output")
    }
}