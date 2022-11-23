package com.study.algos.code.multidimarray

object SpiralPrint {
    /**
     * {startC    ->    endC}
     *      [1,  2,  3,  4],  {startR}
     *      [5,  6,  7,  8],     |
     *      [9,  10, 11, 12],    |
     *      [13, 14, 15, 16]   {endR}
     * ]
     * Take 4 variable loop from
     *      1) startC -> endC
     *      2) startR+1 -> endR
     *      3) endC-1 -> startC
     *      4) endRow-1 -> startR+1
     * Until startC<= endC and starR <= endR
     */

    fun spiralPrint(input: Array<IntArray>, r: Int, c: Int) {

        var startC = 0
        var endC = c - 1
        var startR = 0
        var endR = r - 1

        var output = ""

        while (startC <= endC && startR <= endR) {
            /**
             *  1) startC -> endC
             */
            for (col in startC..endC) {
                output += " " + input[startR][col]
            }
            /**
             * 2) startR+1 -> endR
             */
            for (row in (startR + 1)..endR) {
                output += " " + input[row][endC]
            }
            /**
             *  3) endC-1 -> startC
             */
            if (startC != (endC - 1)) {
                /**
                 * Avoid repeating the loop in case m and n are not equal
                 */
                for (col in (endC - 1) downTo startC) {
                    output += " " + input[endR][col]
                }
            }
            /**
             * 4) endRow-1 -> startR+1
             */
            if (startR != (endR - 1)) {
                /**
                 * Avoid repeating the loop in case m and n are not equal
                 */
                for (row in (endR - 1) downTo (startR + 1)) {
                    output += " " + input[row][startC]
                }
            }
            startC++
            endC--
            startR++
            endR--
        }
        println("Algorithms spiral print -> $output")
    }
}