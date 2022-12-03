package com.study.algos.code.linkedlist

data class Node(
    var data: Int,
    var next: Node?
)

class LinkedList {
    var head: Node? = null

    private fun search(item: Int, node: Node?, pos: Int): Int {
        if (node == null)
            return -1
        if (node.data == item) {
            return pos
        }
        return search(item, node.next, pos + 1)
    }

    fun searchList(item: Int): Int {
        return search(item, head, 1)
    }

    fun insert(item: Int, pos: Int) {
        var looper = head
        var index = 1
        /**
         * Insert at 1st position
         */
        if (pos == 1) {
            val node = Node(item, null)
            val temp = head?.next
            node.next = head
            head?.next = temp
            head = node
        } else
            while (looper != null) {
                if (index == pos - 1) {
                    val node = Node(item, null)
                    val temp = looper.next
                    looper.next = node
                    node.next = temp
                }
                looper = looper.next
                index++
            }
    }

    fun deleteItem(item: Int) {
        var looper = head
        /**
         * First item check
         */
        if (head?.data == item) {
            val temp = head
            head = null
            head = temp?.next
        } else
            while (looper != null) {
                if (looper.next?.data == item) {
                    looper.next = looper.next?.next
                }
                looper = looper.next
            }
    }

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

    fun deleteFront() {
        val temp = head
        head = null
        head = temp?.next
    }

    fun deleteTail() {
        var looper = head
        while (looper != null) {
            looper = looper.next
            if (looper?.next?.next == null){
                looper?.next = null
            }
        }
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
}