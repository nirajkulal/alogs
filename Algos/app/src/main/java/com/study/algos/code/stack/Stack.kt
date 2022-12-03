package com.study.algos.code.stack

class Stack<T> constructor(
    private val stackLimit: Int,
) {
    private var stackSize = 0

    private val isFull: Boolean
        get() {
            return stackSize >= stackLimit
        }

    private val isEmpty: Boolean
        get() {
            return stackSize == 0
        }

    data class Node<T>(
        var data: T? = null,
        var next: Node<T>? = null
    )

    private var head: Node<T>? = null

    fun push(data: T) {
        if (!isFull) {
            var node = Node(data = data, next = head)
            stackSize++
            head = node
        } else {
            println("Stack full")
        }
    }

    fun top(): T? = head?.data

    fun pop(): T? {
        if (isEmpty) {
            println("Stack empty")
            return null
        }
        val temp = head
        head = null
        head = temp?.next
        stackSize--
        return temp?.data
    }
}
