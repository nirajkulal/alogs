package com.study.algos.code.strings

object IdentifyChar {

    fun identifySpaceAndDigits(input: String) {
        val charArray: CharArray = input.toCharArray()
        var digitCount = 0
        var charCount = 0
        var spaceCount = 0
        charArray.forEach {
            if (it in '0'..'9')
                digitCount++
            else if ((it in 'a'..'z') || (it in 'A'..'Z'))
                charCount++
            else if (it == ' ')
                spaceCount++
        }
        println("Algorithms digits $digitCount chars $charCount spaces $spaceCount")
    }

}