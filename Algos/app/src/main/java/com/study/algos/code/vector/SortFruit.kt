package com.study.algos.code.vector

object SortFruit {

    data class Fruit(var name: String = "", var price: Int = 0)

    class NameSort : Comparator<Fruit> {
        override fun compare(p0: Fruit, p1: Fruit): Int {
            return p0.name.compareTo(p1.name)
        }
    }

    class PriceSort : Comparator<Fruit> {
        override fun compare(p0: Fruit, p1: Fruit): Int {
            return p0.price.compareTo(p1.price)
        }
    }

    fun sortFruit(input: Array<Fruit>, sortType: SortType) {
        when (sortType) {
            SortType.PRICE -> input.sortWith(PriceSort())
            SortType.NAME -> input.sortWith(NameSort())
        }
        var output = ""
        input.forEach {
            output += "(${it.name}, ${it.price})"
        }
        println("Algorithms sorted fruits based on ${sortType.name} -> $output")
    }

    enum class SortType {
        PRICE,
        NAME
    }

}