package com.study.algos.code.strings

object FindVowel {

    fun findVowel(input: String) {
        var output = ""
        input.toCharArray().forEach {
            if (it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u') {
                output += it
            }
        }
        println("Algorithms vowels $input is $output")

    }

}