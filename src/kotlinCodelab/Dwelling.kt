package kotlinCodelab

abstract class Dwelling(private var residents:Int){
    abstract val buildingMaterial: String
    abstract val capacity:Int

    fun hasRoom():Boolean{
        return residents<capacity
    }
}
class SquareCabin(residents: Int):Dwelling(residents){
    override val buildingMaterial: String ="Wood"
    override val capacity: Int=6
}

 open class RoundHut(residents: Int):Dwelling(residents){
    override val buildingMaterial: String
        get() = "Straw"
    override val capacity: Int
        get() = 4
}

class RoundTower(residents: Int):RoundHut(residents){
    override val buildingMaterial: String ="Stone"
    override val capacity: Int=5
}
