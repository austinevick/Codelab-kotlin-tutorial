package kotlinCodelab.collection.list

class Order(private val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item):Order {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>):Order {
        itemList.addAll(newItems)
        return this
    }

    fun print() {
        println("Order #${orderNumber}")
        var total = 0
        for (item in itemList) {
            println("$item: $${item.price}")
            total += item.price
        }
        println("Total: $$total")
    }
}

open class Item(val name: String, val price: Int)

class Noodles : Item("Noodles", 10) {
    override fun toString(): String {
        return name
    }
}

class Vegetables(private vararg val toppings: String) : Item("Vegetables", 5) {
    override fun toString(): String {
        if (toppings.isEmpty()) return "$name Chef's choice"
        return name + ": " + toppings.joinToString(",")
    }
}