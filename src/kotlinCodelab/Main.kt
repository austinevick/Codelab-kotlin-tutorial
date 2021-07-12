package kotlinCodelab

fun main(args: Array<String>) {
    var squareCabin=SquareCabin(4)
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
    }
    val roundHut=RoundHut(8)
    with(roundHut){
        println("\nRound Hut\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
    }
    val roundTower=RoundTower(4)
    with(roundTower){
        println("\nRound Tower\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
    }
}
