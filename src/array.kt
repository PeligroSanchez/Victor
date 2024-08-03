fun main() {

    var courses = arrayOf("MIT","Android","DataScience")

    //accessing an element
    println(courses[1])

    //reassigning an element
    courses[1] = "Web Development"
    println(courses[1])

    //Looping through an array
    var newcourse = courses.plus("CyberSecurity")
    for (courses in newcourse){
        println(courses)
    }

    println(courses.size)




}