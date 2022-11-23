package com.study.algos.code.recursions

object FindOccurence {

    fun findFirstOccurence(input: Array<Int>, number: Int) {
        val index = findFirstOccurenceRec(input, number, 0)
        println("Algorithms findFirstOccurence of $number at $index")
    }

    private fun findFirstOccurenceRec(input: Array<Int>, number: Int, index: Int): Int {
        if (index == input.size)
            return -1
        if (input[index] == number)
            return index
        return findFirstOccurenceRec(input, number, index + 1)
    }

    fun findLastOccurence(input: Array<Int>, number: Int) {
        val index = findLastOccurenceRec(input, number, 0)
        println("Algorithms findFirstOccurence of $number at $index")
    }

    private fun findLastOccurenceRec(input: Array<Int>, number: Int, index: Int): Int {
        if (index == input.size)
            return -1
        val pos = findLastOccurenceRec(input, number, index + 1)
        return if (pos == -1 && input[index] == number)
            index
        else
            pos
    }

    fun findAllOccurence(input: Array<Int>, number: Int): ArrayList<Int> {
        return findAllOccurenceRec(input, number, 0)
    }

    private fun findAllOccurenceRec(input: Array<Int>, number: Int, index: Int): ArrayList<Int> {
        if (index == input.size)
            return arrayListOf()
        val list = findAllOccurenceRec(input, number, index + 1)
        if (number == input[index])
            list.add(index)
        return list.also {
            it.sort()
        }
    }
}