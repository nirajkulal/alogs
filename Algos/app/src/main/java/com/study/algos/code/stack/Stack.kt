package com.study.algos.code.stack

class Stack<T> constructor(
    private val stackLimit: Int,
) {
    private var stackSize = 0

    private val isFull: Boolean
        get() {
            return stackSize >= stackLimit
        }

    public val isEmpty: Boolean
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

/**
 * empty the stack, then push the desired item to stack
 * recursion used to empty add to keep the items and push to stack while going upwards
 */
fun <T> pushToBottom(stack: Stack<T>, data: T) {
    if (stack.isEmpty) {
        stack.push(data)
        return
    }
    var temp: T? = stack.pop()
    pushToBottom(stack, data)
    if (temp != null) {
        stack.push(temp)
    }
}

/**
 * empty stack and push to bottom
 */
fun <T> reverse(stack: Stack<T>) {
    if (stack.isEmpty) {
        return
    }
    val temp: T? = stack.pop()
    reverse(stack)
    temp?.let {
        pushToBottom(stack, temp)
    }
}

private fun main() {
    val stack: Stack<Int> = Stack(10)
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    stack.push(5)
    stack.push(6)

   reverse(stack)
    while (!stack.isEmpty) {
        println(stack.pop())
    }

}