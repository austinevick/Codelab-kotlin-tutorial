package kotlinCodelab

import kotlin.math.roundToInt

fun main(args: Array<String>) {
    var squareCabin=SquareCabin(4,50.0)
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
    }
    val roundHut=RoundHut(2,10.0)
    with(roundHut){
        println("\nRound Hut\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Floor area: ${floorArea().roundToInt()}")
        println("Carpet size: ${calculateMaxCarpetSize()}")

    }
    val roundTower=RoundTower(4,10.5)
    with(roundTower){
        println("\nRound Tower\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
        println("Floor area: %.2f".format(floorArea()))
        println("Carpet size: ${calculateMaxCarpetSize()}")

    }
}
