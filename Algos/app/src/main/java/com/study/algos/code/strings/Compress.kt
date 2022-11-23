package com.study.algos.code.strings

object Compress {
    /**
     * Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
     * Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
     * Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
     */
    fun compress(input: String) {
        val chars = input.toCharArray()
        val compress = compressChars(chars)
        println("Algorithms compresses $input is ${(compress.joinToString())}")

        val decompressed = decompress(compress)
        println("Algorithms decompresses $input is $decompressed")
    }

    private fun decompress(compress: Array<String>): String {
        var output = ""
        compress.forEachIndexed { index, char ->
            if (char in "a".."z") {
                output += char
            } else {
                var occ = char.toInt()
                while (occ > 1) {
                    output += compress[index - 1]
                    occ--
                }
            }
        }
        return output
    }

    private fun compressChars(chars: CharArray): Array<String> {
        var i = 0
        var compress = arrayOf<String>()
        while (i < chars.size) {
            var occurrences = 1
            compress = compress.plus(chars[i].toString())
            var nextValues = i + 1
            while (nextValues < chars.size && chars[nextValues] == chars[i]) {
                occurrences++
                nextValues++
            }
            if (occurrences > 1) {
                /**
                 * Update outer loop for inner occurrences
                 */
                i += occurrences
                compress = compress.plus(occurrences.toString())
            } else {
                i++
            }
        }
        return compress
    }
}