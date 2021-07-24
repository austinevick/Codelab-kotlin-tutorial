package kotlinCodelab

import kotlinCodelab.listInKotlin.Noodles
import kotlinCodelab.listInKotlin.Order
import kotlinCodelab.listInKotlin.Vegetables
import kotlinCodelab.oopInKotlin.RoundHut
import kotlinCodelab.oopInKotlin.RoundTower
import kotlinCodelab.oopInKotlin.SquareCabin
import kotlin.math.roundToInt

fun main(args: Array<String>) {

//    // KOTLIN LIST
//    println("LIST IN KOTLIN")
//    val ordersList = mutableListOf<Order>()
//
//    // Add an item to an order
//    val order1 = Order(1)
//    order1.addItem(Noodles())
//    ordersList.add(order1)
//
//    // Add multiple items individually
//    val order2 = Order(2)
//    order2.addItem(Noodles())
//    order2.addItem(Vegetables())
//    ordersList.add(order2)
//
//    // Add a list of items at one time
//    val order3 = Order(3)
//    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
//    order3.addAll(items)
//    ordersList.add(order3)
//
//    // Use builder pattern
//    val order4 = Order(4)
//        .addItem(Noodles())
//        .addItem(Vegetables("Cabbage", "Onion"))
//    ordersList.add(order4)
//
//    // Create and add order directly
//    ordersList.add(
//        Order(5)
//            .addItem(Noodles())
//            .addItem(Noodles())
//            .addItem(Vegetables("Spinach"))
//    )
//
//    // Print out each order
//    for (order in ordersList) {
//        order.print()
//        println()
//    }
//
//    // OOP IN KOTLIN
//    println("OOP IN KOTLIN")
//    val squareCabin= SquareCabin(4,50.0)
//    with(squareCabin) {
//        println("\nSquare Cabin\n============")
//        println("Capacity: $capacity")
//        println("Material: $buildingMaterial")
//        println("Has room? ${hasRoom()}")
//        println("Floor area: ${floorArea()}")
//    }
//    val roundHut= RoundHut(2,10.0)
//    with(roundHut){
//        println("\nRound Hut\n============")
//        println("Capacity: $capacity")
//        println("Material: $buildingMaterial")
//        println("Has room? ${hasRoom()}")
//        getRoom()
//        println("Floor area: ${floorArea().roundToInt()}")
//        println("Carpet size: ${calculateMaxCarpetSize()}")
//
//    }
//    val roundTower= RoundTower(4,10.5)
//    with(roundTower){
//        println("\nRound Tower\n============")
//        println("Capacity: $capacity")
//        println("Material: $buildingMaterial")
//        println("Has room? ${hasRoom()}")
//        println("Floor area: %.2f".format(floorArea()))
//        println("Carpet size: ${calculateMaxCarpetSize()}")
//
//    }
}
