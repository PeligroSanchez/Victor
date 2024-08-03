open class Animal{
    var gender = "Male"
    var hasfeathers = true

    fun sound(){
        println("Animal is speaking")
    }
}

open class Eagle:Animal(){
    var hasscales = true
    var isMammal = true
}

open class Ostrich{
    fun movement(){
        println("Ostrich is walking")
    }
}

fun main() {

    var a = Animal()


    var e = Eagle()


    var o = Ostrich()
}