package kotlinCodelab

import kotlin.math.PI

abstract class Dwelling(private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int
    abstract fun floorArea(): Double
    fun hasRoom(): Boolean {
        return residents < capacity
    }
}

class SquareCabin(residents: Int, private val length: Double) : Dwelling(residents) {
    override val buildingMaterial: String = "Wood"
    override val capacity: Int = 6
    override fun floorArea(): Double {
        return length * length
    }
}

open class RoundHut(residents: Int, private val radius: Double) : Dwelling(residents) {
    override val buildingMaterial: String
        get() = "Straw"
    override val capacity: Int
        get() = 4

    override fun floorArea(): Double {
        return PI * radius * radius
    }
}

class RoundTower(residents: Int, radius: Double, floors: Int = 2)
    : RoundHut(residents, radius) {
    override val buildingMaterial: String = "Stone"
    override val capacity: Int = 5 * floors
}
