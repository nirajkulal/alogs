package com.study.algos.code.strings

object RemoveDuplicate {

    /**
     * Using map
     */
    fun removeDuplicates(input: String) {
        val map: LinkedHashMap<Char, Int> = LinkedHashMap()
        input.toCharArray().forEach {
            if (!map.containsKey(it)) {
                map[it] = 1
            }
        }
        var output = ""
        map.entries.forEach {
            output += it.key
        }
        println("Algorithms removed duplicate of $input is $output")
    }

}