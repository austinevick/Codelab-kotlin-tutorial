package kotlinCodelab

fun main(args: Array<String>) {
    var squareCabin=SquareCabin(4,50.0)
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
    }
    val roundHut=RoundHut(8,10.0)
    with(roundHut){
        println("\nRound Hut\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
    }
    val roundTower=RoundTower(4,15.5)
    with(roundTower){
        println("\nRound Tower\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
    }
}
