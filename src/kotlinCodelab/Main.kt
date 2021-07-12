package kotlinCodelab

fun main(args: Array<String>) {
    var squareCabin=SquareCabin(4)
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
    }
}
