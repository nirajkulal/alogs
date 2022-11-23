package com.study.algos.code.strings

object Palindrome {

    fun palindrome(input: String) {
        val chars = input.toCharArray()
        var end = chars.size - 1
        var isPalindrome = true
        for (i in chars.indices) {
            if (chars[i] != chars[end]) {
                isPalindrome = false
                break
            }
            end--
        }
        if (isPalindrome) {
            println("Algorithms $input is palindrome")
        } else {
            println("Algorithms $input is not palindrome")
        }
    }
}