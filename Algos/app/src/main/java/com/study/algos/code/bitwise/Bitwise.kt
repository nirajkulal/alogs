package com.study.algos.code.bitwise

object Bitwise {

    fun isOddEven(number: Int) {
        if (number and 1 == 1)
            println("Algorithms $number is Odd found using bitwise 'AND'")
        else
            println("Algorithms $number is Even found using bitwise 'AND'")
    }

    fun getIBit(i: Int, number: Int) {
        /**
         *
         *   000010 - input i=1
         *   000010 - masked = left shift 1 up to i
         *
         *   000010 and
         *   000010
         *   000010 -> 2 that is greater then 0
         *
         *   if no > 0 then bit is 1
         *
         */
        val mask = 1 shl i
        if (mask and number > 0) {
            println("Algorithms $number 's $i th bit 1")
        } else
            println("Algorithms $number 's $i th bit 0")
    }

    fun setIBit(i: Int, number: Int) {
        /**
         *
         *   10000 - input i=1
         *   00010 - masked =left shift 1 up to i
         *
         *   10000 or
         *   00010
         *   10010
         *
         */
        val mask = 1 shl i
        val maskedNo = number or mask
        println("Algorithms $number modified to $maskedNo with bit at $i")
    }

    fun clearIBit(i: Int, number: Int): Int {
        /**
         *
         *    110     input i=1
         *    010     left shift 1 up to i
         *    101     inverse = masked
         *
         *    110 and
         *    101         [clear at i=1]
         *    100
         *
         */
        val mask = (1 shl i).inv()
        val maskedNo = number and mask
        println("Algorithms $number modified to $maskedNo with bit at $i")
        return maskedNo
    }

    fun updateIthBit(i: Int, value: Int, number: Int) {
        /**
         *  110 - input  i-1 value = 0           110 - input  i-1 value = 1
         *
         *  clear ith bit - clearIBit()          clear ith bit - clearIBit()
         *  100                                  100
         *
         *  000 left shift 0(value) up to 1      010 left shift 1(value) up to 1
         *
         *  100  0r                              100 or
         *  000                                  010
         *  100                                  110
         */
        //clear bit
        val clearBit = clearIBit(i, number)

        val maskedNo = (value shl i)
        val updatedBit = clearBit or maskedNo
        println("Algorithms $number modified to $updatedBit with bit at $i value $value")
    }

    fun clearLastBits(range: Int, number: Int): Int {
        /**
         *  1010111=number  range=3
         *
         *  11111111 (1 inv or (-1))
         *  11111000 = shl 3 of -1
         *
         *  1010111 and
         *  1111000
         *
         *  1010000
         *
         *
         */
        val mask = (1.inv()) shl range
        val clearedBit = number and mask
        println("Algorithms $number modified to $clearedBit with range  $range")
        return clearedBit
    }

    fun clearRangeBits(i: Int, j: Int, number: Int): Int {
        /**
         *    31- 11111  i=1 j=2
         *
         *    a = 11000   -1<<(j+1)
         *    b = 00001  (1<<i -1)    ex =15  1111 7=111
         *    mask = 11001
         *
         *    11111 and
         *    11001
         *    11001
         *
         */

        /**
         * Getting proper result on (1.inv()) shl (j)
         */
        val a = (1.inv()) shl (j)
        val b = (1 shl i) - 1
        val mask = a or b
        val clearRange = number and mask
        println("Algorithms $number modified to $clearRange with range from $i to $j")
        return clearRange
    }

    /**
     * Clear bits from i and j
     * m<<i to get into m th position
     *
     *  1111 =15 m=2 i=1 j=3
     *
     *  after clear 0001 or
     *  m<<1        0100
     *              0101=7
     *
     *
     */
    fun replaceBits(i: Int, j: Int, number: Int, m: Int): Int {
        val clearRange = clearRangeBits(i, j, number)
        val mask = m shl i
        val replacedBit = clearRange or mask
        println("Algorithms $number replaced to $replacedBit with range from $i to $j and m=$m")
        return replacedBit
    }

    /**
     *  n&(n-1) always will be zero in case of power of 2
     *  ex 11111 & 01111 =0
     */
    fun powerOf2(number: Int) {
        if (number and (number - 1) == 0) {
            println("Algorithms $number is power of 2")
        } else {
            println("Algorithms $number is not power of 2")
        }
    }

    /**
     *   And with number gives last bit value, then remove last bit by right shift by 1
     */
    fun findSetBits(number: Int) {
        var num = number
        var countBits = 0
        while (num > 0) {
            countBits += (num and 1)
            num = num shr 1
        }
        println("Algorithms $number has $countBits set bits")
        hack(number)
    }

    private fun hack(number: Int) {
        var num = number
        var countBits = 0
        while (num > 0) {
            num = num and (num - 1)
            countBits++
        }
        println("Algorithms $number has $countBits set bits by faster method")
    }

    /**
     *
     * 2^5 = 2^101
     *     = 2^2 * 2^1
     */
    fun fastExpo(number: Int, exp: Int): Int {
        var expBits = exp
        var pow = number
        var expValue = 1
        while (expBits > 0) {
            if (expBits and 1 == 1) {
                expValue *= pow
            }
            expBits = expBits shr 1
            pow *= number
        }
        println("Algorithms $expValue of $number ^ $exp")
        return expValue
    }

    /**
     *  We can use Xor here, XOR properties
     *
     *  "0" when two input values  same
     *
     */
    fun findUniqueNo(input: Array<Int>) {
        var out = 0
        input.forEach {
            out = out xor it
        }
        println("Algorithms unique no is $out")
    }

    /**
     *  use 10th power to create binary no
     *  take last bit each time and add along with power
     *
     */
    fun findBinary(number: Int) {
        var pow = 1
        var answer = 0
        var num = number
        while (num > 0) {
            val lastBit = num and 1
            /**
             * In case of 0, 0 added to answer makes no change
             */
            answer += pow * lastBit
            num = num shr 1
            pow *= 10
        }
        println("Algorithms binary of $num is $answer")
    }

    fun findSteps(number: Int) {
        var num = number
        var answer = 0
        while (num > 0) {
            if (num and 1 == 1)
                answer++
            num = num shr 1
        }
        println("Algorithms min no of steps for $number is  $answer")

    }
}
