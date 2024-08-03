class Dog(var name:String,var breed:String,var color:String){

}

fun main() {

    var dog1 = Dog("Bob","German Shepherd","brown")
    println(dog1.name+""+dog1.breed)

    var dog2 = Dog("Jessie","Pitbull","Black")
    println(dog2.name+""+dog2.color)

    var dog3 = Dog("Aundrey","Bull Dog","brown")
    println(dog3.name+""+dog3.breed)
}