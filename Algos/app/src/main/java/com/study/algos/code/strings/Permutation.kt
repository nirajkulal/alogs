package com.study.algos.code.strings

object Permutation {

    /**
     * For example, “abcd” and “dabc” are Permutation of each other.
     *
     * string A = "test", B = "ttew"
     * Sample Output -> NO
     */
    fun isPermutation(input1: String, input2: String) {

        var isPermutation = true

        if (input1.length != input2.length) {
            isPermutation = false
        }

        if (isPermutation) {
            val input1Chars = input1.toCharArray()
            val input2Chars = input2.toCharArray()

            for (index1 in input1Chars.indices) {
                var isPresent = false
                for (index2 in input2Chars.indices) {
                    if (input1Chars[index1] == input2Chars[index2]) {
                        /**
                         * Break the loop when we found char as repeated char can be available in array
                         */
                        isPresent = true
                        input2Chars[index2] = ' '
                        break
                    }
                }
                if (!isPresent) {
                    /**
                     * Not found current char in the input 2
                     */
                    isPermutation = false
                    break
                }
            }
        }

        println("Algorithms isPermutation $input1 and $input2 -> $isPermutation")
    }
}