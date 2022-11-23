package com.study.algos.code.vector

object SortCabs {

    data class Points(var x: Int, var y: Int) : Comparable<Points> {
        /**
         * Combined x y considered as distance traveled
         */
        override fun compareTo(other: Points): Int =
            (x + y).compareTo(other.x + other.y)
    }

    fun sortCabs(input: Array<Points>) {
        input.sort()
        var output = ""
        input.forEach {
            output += "(${it.x}, ${it.y})"
        }
        println("Algorithms sorted points $output")
    }
}