import java.util.Scanner

fun main() {

    var read = Scanner(System.`in`)

   println("Enter the length : ")
    val length = read.nextInt()
    println("The length of rectangle is $length metres")

    println("Enter the width :")
    val width = read.nextInt()
    println("The width of rectangle is $width metres")

    val area = length * width

    println("The area of the rectangle is $area")



}