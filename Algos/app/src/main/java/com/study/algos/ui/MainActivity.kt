package com.study.algos.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.study.algos.code.arrays.*
import com.study.algos.code.binarysearch.BinarySearch
import com.study.algos.code.bitwise.Bitwise
import com.study.algos.code.multidimarray.*
import com.study.algos.code.recursions.*
import com.study.algos.code.sorting.BubbleSort
import com.study.algos.code.sorting.CountingSort
import com.study.algos.code.sorting.InsertionSort
import com.study.algos.code.sorting.SelectionSort
import com.study.algos.code.strings.*
import com.study.algos.code.vector.MakeZeros
import com.study.algos.code.vector.RotateMatrix
import com.study.algos.code.vector.SortCabs
import com.study.algos.code.vector.SortFruit

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
            ) {
                Algorithms()
            }

        }

    }

}

@Composable
fun Algorithms() {
    Column(
        modifier = Modifier
            .padding(
                10.dp
            )
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
    ) {
        Label(
            text = "Binary search"
        ) {
            val index = BinarySearch.binarySearch(arrayOf(10, 20, 33, 41, 54, 67, 88), 88)
            println("Algorithms: Item position ${index + 1}")
        }

        Label(
            text = "Reverse Array"
        ) {
            val array = arrayOf(10, 20, 33, 41, 54, 67)
            ReverseArray.reverseArray(array)
            println("Algorithms: reversed Array")
            array.forEach {
                println("Algorithms: $it")
            }
        }
        Label(
            text = "Pairs"
        ) {
            Pairs.pairs(arrayOf(10, 20, 33, 41, 54, 67))
        }
        Label(
            text = "Sub arrays"
        ) {
            SubArray.subArrays(arrayOf(10, 20, 33, 41, 54, 67))
        }
        Label(
            text = "Max Sub array Sum bruteforce"
        ) {
            SubArray.subArraysMaxSumBruteforce(arrayOf(-10, -20, -30, 40, 50, 60))
        }
        Label(
            text = "Max Sub array Sum Prefix array"
        ) {
            SubArray.subArraysMaxSumPrefixSum(arrayOf(-10, -20, -30, 40, 50, -60))
        }
        Label(
            text = "Max Sub array Sum Kadens"
        ) {
            SubArray.subArraysMaxSumKadens(arrayOf(10, -20, 30, 40, -50, -55))
        }
        Label(
            text = "Max Sub array Sum by Temp"
        ) {
            SubArray.subArraysMaxTemp(arrayOf(10, -20, 30, 40, -50, -55))
        }
        Label(
            text = "Lowest bound by difference"
        ) {
            LowestBound.lowestBoundByDifference(arrayOf(-1, -1, 2, 3, 5, 8, 11), 6)
        }
        Label(
            text = "Lowest bound by Binary search"
        ) {
            LowestBound.lowestBoundByBinarySearch(arrayOf(-1, -1, 2, 3, 5, 8, 11), 2)
        }
        Label(
            text = "Sorted pair sum"
        ) {
            SortedPairSum.sortedPair(arrayOf(10, 20, 30, 50, 60, 65), 141)
        }
        Label(
            text = "Rotate array"
        ) {
            Rotate.rotate(arrayOf(10, 20, 30, 50, 60, 65, 90, 100), 5)
        }

        Label(
            text = "Bubble sort"
        ) {
            BubbleSort.bubbleSort(arrayOf(100, 20, 300, 50, -160, 65, 990, -10))
        }
        Label(
            text = "Bubble sort optimsed"
        ) {
            BubbleSort.bubbleSortOptimised(arrayOf(100, 20, 300, 50, -160, 65, 990, -10))
        }
        Label(
            text = "Insertion sort"
        ) {
            InsertionSort.insertionSort(arrayOf(100, 20, 300, 50, -160, 65, 990, -10))
        }
        Label(
            text = "Selection sort"
        ) {
            SelectionSort.selectionSort(arrayOf(100, 20, 300, 50, -160, 65, 990, -10))
        }
        Label(
            text = "Counting sort"
        ) {
            CountingSort.countingSort(arrayOf(100, 20, 300, 50, 160, 65, 990, 10))
        }
        Label(
            text = "Count digit char space"
        ) {
            IdentifyChar.identifySpaceAndDigits("asdAAAAAA1234AA5  5 5 555 9")
        }
        Label(
            text = "Short path"
        ) {
            ShortestPath.findShortPath("NNNSSWWWWWEEEEEEEESN")
        }
        Label(
            text = "Palindrome"
        ) {
            Palindrome.palindrome("ASDDSA")
            Palindrome.palindrome("ASDDSAQQ")
            Palindrome.palindrome("qwertyytrewq")
            Palindrome.palindrome("asa")
        }
        Label(
            text = "Compress"
        ) {
            Compress.compress("aaaaaaaaaaaaaaasssswwswwwqqqls")
            Compress.compress("aqwwrsttyzzzv")
        }
        Label(
            text = "Permutation"
        ) {
            Permutation.isPermutation("abcd", "adcb")
            Permutation.isPermutation("abcd", "qdcb")
            Permutation.isPermutation("aa14", "12345")
            Permutation.isPermutation("aa14", "1234")
            Permutation.isPermutation("aa14z", "14zaa")
        }
        Label(
            text = "Remove Duplicate"
        ) {
            RemoveDuplicate.removeDuplicates("asdasdaawqqew'asd")
        }
        Label(
            text = "Find vowel"
        ) {
            FindVowel.findVowel("asdasdaawqqewasd")
        }
        Label(
            text = "Binary to Int"
        ) {
            BinaryToInt.binaryToInt("101")
            BinaryToInt.binaryToInt("111")
            BinaryToInt.binaryToInt("1111")
            BinaryToInt.binaryToInt("1010")
        }
        Label(
            text = "Spiral print"
        ) {
            val input = Array(4) { IntArray(4) { 0 } }
            input[0] = intArrayOf(1, 2, 3, 4)
            input[1] = intArrayOf(5, 6, 7, 8)
            input[2] = intArrayOf(9, 10, 11, 12)
            input[3] = intArrayOf(13, 14, 15, 16)
            SpiralPrint.spiralPrint(input, 4, 4)

            val input2 = Array(3) { IntArray(4) { 0 } }
            input2[0] = intArrayOf(1, 2, 3, 4)
            input2[1] = intArrayOf(5, 6, 7, 8)
            input2[2] = intArrayOf(9, 10, 11, 12)
            SpiralPrint.spiralPrint(input2, 3, 4)


            val input3 = Array(4) { IntArray(3) { 0 } }
            input3[0] = intArrayOf(1, 2, 3)
            input3[1] = intArrayOf(4, 5, 6)
            input3[2] = intArrayOf(7, 8, 9)
            input3[3] = intArrayOf(10, 11, 12)
            SpiralPrint.spiralPrint(input3, 4, 3)
        }
        Label(
            text = "Wave print"
        ) {
            val input = Array(4) { IntArray(4) { 0 } }
            input[0] = intArrayOf(1, 2, 3, 4)
            input[1] = intArrayOf(5, 6, 7, 8)
            input[2] = intArrayOf(9, 10, 11, 12)
            input[3] = intArrayOf(13, 14, 15, 16)
            WavePrint.wavePrint(input, 4, 4)

            val input2 = Array(3) { IntArray(4) { 0 } }
            input2[0] = intArrayOf(1, 2, 3, 4)
            input2[1] = intArrayOf(5, 6, 7, 8)
            input2[2] = intArrayOf(9, 10, 11, 12)
            WavePrint.wavePrint(input2, 3, 4)


            val input3 = Array(4) { IntArray(3) { 0 } }
            input3[0] = intArrayOf(1, 2, 3)
            input3[1] = intArrayOf(4, 5, 6)
            input3[2] = intArrayOf(7, 8, 9)
            input3[3] = intArrayOf(10, 11, 12)
            WavePrint.wavePrint(input3, 4, 3)
        }
        Label(
            text = " Staircase search"
        ) {
            val input = Array(4) { IntArray(4) { 0 } }
            input[0] = intArrayOf(1, 2, 3, 4)
            input[1] = intArrayOf(5, 6, 7, 8)
            input[2] = intArrayOf(9, 10, 11, 12)
            input[3] = intArrayOf(13, 14, 15, 16)
            SortedArraySearch.searchSortedArray(input, 5, 4, 4)

            val input2 = Array(3) { IntArray(4) { 0 } }
            input2[0] = intArrayOf(1, 2, 3, 4)
            input2[1] = intArrayOf(5, 6, 7, 8)
            input2[2] = intArrayOf(9, 10, 11, 12)
            SortedArraySearch.searchSortedArray(input2, 13, 3, 4)


            val input3 = Array(4) { IntArray(3) { 0 } }
            input3[0] = intArrayOf(1, 2, 3)
            input3[1] = intArrayOf(4, 5, 6)
            input3[2] = intArrayOf(7, 8, 9)
            input3[3] = intArrayOf(10, 15, 19)
            SortedArraySearch.searchSortedArray(input3, 11, 4, 3)
        }
        Label(
            text = " Mango tree"
        ) {
            val input = Array(6) { Array(6) { "" } }
            input[0] = arrayOf(".", "#", "#", ".", ".", ".")
            input[1] = arrayOf("#", ".", ".", "#", "#", ".")
            input[2] = arrayOf(".", "#", ".", ".", ".", ".")
            input[3] = arrayOf(".", "#", "#", ".", ".", "#")
            input[4] = arrayOf("#", ".", ".", "#", "#", ".")
            input[5] = arrayOf(".", "#", ".", ".", ".", ".")

            MangoTree.mangoTree(input, 6, 6)
        }
        Label(
            text = " Pascal Triangle"
        ) {
            PascalsTriangle.pascalsTriangle(15)
        }
        Label(
            text = "Sub Matrix Sum"
        ) {
            val input = Array(4) { Array(5) { 0 } }
            input[0] = arrayOf(1, 2, 3, 4, 6)
            input[1] = arrayOf(5, 3, 8, 1, 2)
            input[2] = arrayOf(4, 6, 7, 5, 5)
            input[3] = arrayOf(2, 4, 8, 9, 4)
            SubMatrixSum.subMatrixSum(input, 4, 5, 0, 0, 1, 1)
            SubMatrixSum.subMatrixSum(input, 4, 5, 2, 2, 3, 4)
            SubMatrixSum.subMatrixSum(input, 4, 5, 1, 2, 3, 3)
        }

        Label(
            text = "Sort Cabs"
        ) {
            SortCabs.sortCabs(
                arrayOf(
                    SortCabs.Points(2, 3),
                    SortCabs.Points(1, 2),
                    SortCabs.Points(3, 4),
                    SortCabs.Points(2, 4),
                    SortCabs.Points(1, 4),
                )
            )
        }
        Label(
            text = "Sort Fruits"
        ) {
            SortFruit.sortFruit(
                arrayOf(
                    SortFruit.Fruit("Apple", 100),
                    SortFruit.Fruit("Grapes", 10),
                    SortFruit.Fruit("Guava", 20),
                    SortFruit.Fruit("Mango", 90),
                    SortFruit.Fruit("Banana", 70),
                ), SortFruit.SortType.NAME
            )
            SortFruit.sortFruit(
                arrayOf(
                    SortFruit.Fruit("Apple", 100),
                    SortFruit.Fruit("Grapes", 10),
                    SortFruit.Fruit("Guava", 20),
                    SortFruit.Fruit("Mango", 90),
                    SortFruit.Fruit("Banana", 70),
                ), SortFruit.SortType.PRICE
            )
        }

        Label(
            text = "Make zero"
        ) {
            val input = Array(4) { Array(5) { 0 } }
            input[0] = arrayOf(1, 2, 3, 4, 6)
            input[1] = arrayOf(5, 3, 0, 1, 2)
            input[2] = arrayOf(4, 2, 7, 5, 5)
            input[3] = arrayOf(2, 4, 8, 9, 9)

            MakeZeros.makeZeros(input, 4, 5)
            val input2 = Array(4) { Array(5) { 0 } }
            input2[0] = arrayOf(0, 2, 3, 4, 6)
            input2[1] = arrayOf(5, 3, 9, 1, 2)
            input2[2] = arrayOf(4, 2, 7, 0, 5)
            input2[3] = arrayOf(2, 9, 8, 9, 9)

            MakeZeros.makeZeros(input2, 4, 5)
        }
        Label(
            text = "Rotate matrix"
        ) {
            val input = Array(5) { Array(5) { 0 } }
            input[0] = arrayOf(1, 2, 3, 4, 5)
            input[1] = arrayOf(6, 7, 8, 9, 10)
            input[2] = arrayOf(11, 12, 13, 14, 15)
            input[3] = arrayOf(16, 17, 18, 19, 20)
            input[4] = arrayOf(21, 22, 23, 24, 25)
            RotateMatrix.rotateMatrix(input, 5)
        }
        Label(text = "Odd/even") {
            Bitwise.isOddEven(3)
            Bitwise.isOddEven(19)
            Bitwise.isOddEven(10)
        }
        Label(text = "Get iTh bit") {
            Bitwise.getIBit(0, 5)
            Bitwise.getIBit(1, 5)
            Bitwise.getIBit(2, 5)
        }
        Label(text = "Set iTh bit") {
            Bitwise.setIBit(0, 5)
            Bitwise.setIBit(1, 5)
            Bitwise.setIBit(2, 5)
        }
        Label(text = "Clear iTh bit") {
            Bitwise.clearIBit(0, 5)
            Bitwise.clearIBit(1, 5)
            Bitwise.clearIBit(2, 5)
        }
        Label(text = "Update iTh bit") {
            Bitwise.updateIthBit(0, 0, 5)
            Bitwise.updateIthBit(0, 1, 5)
            Bitwise.updateIthBit(1, 0, 5)
            Bitwise.updateIthBit(1, 1, 5)
            Bitwise.updateIthBit(2, 0, 5)
            Bitwise.updateIthBit(2, 1, 5)
        }
        Label(text = "Clear Last bits") {
            Bitwise.clearLastBits(3, 87)
        }
        Label(text = "Clear range") {
            Bitwise.clearRangeBits(1, 1, 31)
            Bitwise.clearRangeBits(1, 2, 31)
            Bitwise.clearRangeBits(1, 3, 31)
        }
        Label(text = "Replace range") {
            Bitwise.replaceBits(1, 3, 15, 2)
        }
        Label(text = "Power of2") {
            Bitwise.powerOf2(16)
            Bitwise.powerOf2(160)
            Bitwise.powerOf2(144)
        }
        Label(text = "Count bits") {
            Bitwise.findSetBits(16)
            Bitwise.findSetBits(15)
            Bitwise.findSetBits(31)
            Bitwise.findSetBits(7)
        }
        Label(text = "Fast expo") {
            Bitwise.fastExpo(2, 5)
            Bitwise.fastExpo(5, 3)
        }
        Label(text = "Find unique no") {
            Bitwise.findUniqueNo(arrayOf(1, 2, 3, 4, 5, 1, 2, 5, 9, 3, 4))
            Bitwise.findUniqueNo(arrayOf(11, 12, 13, 15, 11, 12, 13, 16, 19, 15, 16))
        }
        Label(text = "Find Binary") {
            Bitwise.findBinary(15)
            Bitwise.findBinary(16)
        }
        Label(text = "Find Steps") {
            Bitwise.findSteps(15)
            Bitwise.findSteps(7)
            Bitwise.findSteps(16)
        }
        Label(text = "Factorial") {
            Factorial.factorial(5)
            Factorial.factorial(4)
            Factorial.factorial(3)
        }
        Label(text = "Check sorted") {
            SortedArrayCheck.checkArraySorted(arrayOf(1, 2, 3, 4, 5))
            SortedArrayCheck.checkArraySorted(arrayOf(1, 9, 3, 4, 5))
            SortedArrayCheck.checkArraySorted(arrayOf(1, 2, 3, 4, 10))
        }
        Label(text = "Check direction") {
            loopUp(5)
            loopDown(5)
        }
        Label(text = "Check occurence") {
            FindOccurence.findFirstOccurence(arrayOf(1, 2, 3, 4, 5, 6, 5), 5)
            FindOccurence.findFirstOccurence(arrayOf(1, 2, 3, 4, 5), 10)
        }
        Label(text = "Check Last occurence") {
            FindOccurence.findLastOccurence(arrayOf(1, 2, 3, 4, 5, 6, 5, 10), 5)
            FindOccurence.findLastOccurence(arrayOf(1, 2, 3, 4, 5), 10)
        }
        Label(text = "loop up List") {
            val list = loopUpList(5)
            list.forEach {
                println("Algorithms loop UP List $it")
            }
        }
        Label(text = "Check occurence All") {
            val list = FindOccurence.findAllOccurence(arrayOf(5, 2, 3, 4, 5, 6, 5, 10), 5)
            list.forEach {
                println("Algorithms Check occurence All List $it")
            }
        }
        Label(text = "Power of N") {
            println("Algorithms Check 2^5 ${PowerOfNum.findPower(2, 5)}")
            println("Algorithms Check 2^6 ${PowerOfNum.findPower(2, 6)}")
            println("Algorithms Check 5^5 ${PowerOfNum.findPower(5, 5)}")
            println("Algorithms Check 5^3 ${PowerOfNum.findPower(5, 3)}")
            println("Algorithms Check fastPower 2^5 ${PowerOfNum.fastPower(2, 5)}")
            println("Algorithms Check fastPower 2^6 ${PowerOfNum.fastPower(2, 6)}")
            println("Algorithms Check fastPower 5^5 ${PowerOfNum.fastPower(5, 5)}")
            println("Algorithms Check fastPower 5^3 ${PowerOfNum.fastPower(5, 3)}")
        }
    }
}

@Composable
fun Label(text: String, onClick: () -> Unit) {
    Button(
        onClick = {
            onClick()
        }, modifier = Modifier
            .padding(top = 10.dp)
            .fillMaxWidth()
    ) {
        Text(text = text)
    }
}

