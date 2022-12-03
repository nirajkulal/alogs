package com.study.algos.code.linkedlist

data class Node(
    var data: Int,
    var next: Node?
)

class LinkedList {
    var head: Node? = null
    fun addItem(item: Int) {
        if (head == null) {
            head = Node(item, null)
        } else {
            val node = Node(item, null)

            /**
             * Identify last node
             */
            var looper = head
            while (looper?.next != null) {
                looper = looper.next
            }
            looper?.next = node
        }
    }

    fun addToStart(item: Int) {
        val node = Node(item, null)
        if (head != null) {
            node.next = head
        }
        head = node
    }

    fun traverse() {
        var looper = head
        while (looper != null) {
            println(" ${looper.data}")
            looper = looper.next
        }
    }

    fun reverse() {
        println(" reverse")
        var looper = head
        var prev: Node? = null
        while (looper != null) {
            val next = looper.next
            looper.next = prev
            prev = looper
            looper = next
        }
        head = prev
    }
}

fun main() {
    val linkedList = LinkedList()
    linkedList.addItem(1)
    linkedList.addItem(2)
    linkedList.addItem(3)
    linkedList.addItem(4)
    linkedList.addItem(5)
    linkedList.traverse()

    println("linkedList2")

    val linkedList2 = LinkedList()
    linkedList2.addToStart(1)
    linkedList2.addToStart(2)
    linkedList2.addToStart(3)
    linkedList2.addToStart(4)
    linkedList2.addToStart(5)
    linkedList2.traverse()
}