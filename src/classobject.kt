class  Person{
    //Attributes/Properties/Variables
    var name = "Mary"
    var age  = 23
    var gender = "Female"

    //Behaviour/Function/Method
    fun Movement(){
        println("Person is walking")
    }
}

fun main() {

    var student = Person()
    println(student.gender)

    var doctor = Person()
    println(doctor.name)

    var accountant = Person()
    println(accountant.age)
}