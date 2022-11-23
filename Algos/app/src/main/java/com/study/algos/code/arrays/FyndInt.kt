package com.study.algos.code.arrays

object FyndInt {

    /*
(1,2,3,4,5) && (a,b,c,d,e)
->> (1,2,a,3,4,b,5,c)
*/
    fun createList(input1: Array<Int>, input2: Array<Int>) {
        var outPut: ArrayList<Int> = arrayListOf()
        var loop1 = 0
        var loop2 = 0
        var count = 0
        while (loop1 < input1.size || loop2 < input2.size) {

            if (loop1 == input1.size) {
                //add input2
                while (loop2 < input2.size) {
                    outPut.add(input2[loop2++])

                }
                break
            }
            if (loop2 == input2.size) {
                //add input1
                while (loop1 < input1.size) {
                    outPut.add(input1[loop1++])
                }
                break
            }
            if (count == 2) {
                count = 0
                outPut.add(input2[loop2++])
            } else {
                outPut.add(input1[loop1])
                loop1++
            }
            count++
        }
        outPut.forEach {
            println(" $it")
        }
    }
}

public fun main() {
    val input1: Array<Int> = arrayOf(1, 2, 3)
    val input2: Array<Int> = arrayOf(6, 7, 8)
    FyndInt.createList(input1, input2)
}