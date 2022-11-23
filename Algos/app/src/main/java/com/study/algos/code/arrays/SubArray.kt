package com.study.algos.code.arrays

import kotlin.math.max

object SubArray {
    fun subArrays(array: Array<Int>) {
        for (i in array.indices) {
            for (j in (i) until array.size) {
                var subArray = ""
                for (k in (i)..j) {
                    subArray += " ${array[k]}"
                }
                println("Algorithms $subArray")
            }
        }
    }

    fun subArraysMaxSumBruteforce(array: Array<Int>) {
        var maxSubArraySum = 0
        for (i in array.indices) {
            for (j in (i) until array.size) {
                var sum = 0
                for (k in (i)..j) {
                    sum += array[k]
                }
                if (maxSubArraySum < sum) maxSubArraySum = sum
            }
        }
        println("Algorithms subArray Sum max $maxSubArraySum")
    }

    fun subArraysMaxSumPrefixSum(array: Array<Int>) {
        var maxSubArraySum = 0
        val prefixArray = IntArray(array.size)
        prefixArray[0] = array.first()
        //Create prefix Sum array
        //arr[i] = arr[i] +arr[i-1]
        for (i in 1 until array.size) {
            prefixArray[i] = prefixArray[i - 1] + array[i]
        }
        for (i in array.indices) {
            for (j in (i) until array.size) {
                //get sum from prefix array at j and ignore sum before i when i>0 else prefix[i]
                //prefix[j] - prefix[i-1]
                val sum: Int = if (i == 0) prefixArray[j] else prefixArray[j] - prefixArray[i - 1]
                if (maxSubArraySum < sum) maxSubArraySum = sum
            }
        }
        println("Algorithms subArray Sum max $maxSubArraySum")
    }

    fun subArraysMaxSumKadens(array: Array<Int>) {
        //create running sum and store max sum in another variable, reset when running sum goes -ve
        //as once it goes -ve it can not be part of max sum as it will not help in creating max sum
        var runningSum = 0
        var maxSum = 0

        for (i in array.indices) {
            runningSum += array[i]
            if (runningSum > maxSum) {
                maxSum = runningSum
            }
            if (runningSum < 0) {
                runningSum = 0
            }
        }
        println("Algorithms subArray Sum max $maxSum")
    }

    fun subArraysMaxTemp(array: Array<Int>) {
        var maxSum = 0
        var runningSum = 0

        var sumOfPositive = 0

        var isNegetive = false

        //If all positive return sum of array
        for (i in array.indices){
            if(array[i]<0) isNegetive = true
            sumOfPositive += array[i]
        }
        if (!isNegetive){
            println("Algorithms subArray Sum max $sumOfPositive")
            return
        }
        for (i in array.indices) {
            //Check sum including current value, if is less than current value do not include and
            //Reset to current value
            runningSum = if ((runningSum + array[i]) < array[i]) {
                array[i]
            } else {
                runningSum + array[i]
            }
            maxSum = max(maxSum,runningSum)
        }

        println("Algorithms subArray Sum max $maxSum")
    }
}