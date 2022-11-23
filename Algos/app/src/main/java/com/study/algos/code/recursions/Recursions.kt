package com.study.algos.code.recursions

fun loopUp(number: Int): Int {
    /**
     * Print of numbers are after end recursive call, so printing happens when fun started retuning
     * that is bottom to up
     */
    if (number == 0)
        return 0
    loopUp(number - 1)
    println("Algorithms loopUp $number")
    return number
}

fun loopDown(number: Int) {
    /**
     * Print of numbers are before the recursive, so print happens during function stacking
     * that is top to bottom
     */
    if (number == 0)
        return
    println("Algorithms loopDown $number")
    loopDown(number - 1)
}


fun loopUpList(number: Int): MutableList<Int> {
    if (number == 0)
        return mutableListOf(0)
    val list = loopUpList(number - 1)
    list.add(number)
    return list
}
