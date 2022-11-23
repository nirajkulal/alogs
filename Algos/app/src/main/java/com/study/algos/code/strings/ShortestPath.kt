package com.study.algos.code.strings

import kotlin.math.abs

object ShortestPath {

    /**
     * Identify shortest path based on directions
     * ex: SSNNNNS will be NNS
     */
    fun findShortPath(input: String) {
        val chars = input.toCharArray()

        /**
         * Based on graph increase/decrease x and y axis accordingly
         */
        var x = 0
        var y = 0
        chars.forEach {
            when (it.lowercaseChar()) {
                'n' -> y++
                'e' -> x++
                'w' -> x--
                's' -> y--
            }
        }

        var output = ""
        if (x > 0)
            for (i in 1..x) {
                output += "E"
            }
        else
            for (i in 1..abs(x)) {
                output += "W"
            }
        if (y > 0)
            for (i in 1..y) {
                output += "N"
            }
        else
            for (i in 1..abs(y)) {
                output += "S"
            }

        println("Algorithms shortest path of $input is $output")
    }

}