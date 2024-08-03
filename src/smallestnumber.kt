import java.util.Scanner

fun main() {

    var read = Scanner(System.`in`)
    println("Enter the first number")

    var first = read.nextInt()

    println("Enter the second nymber")
    var second = read.nextInt()

    if (first < second){
        println("$first is the smallest")
    }
    else{
        println("$second is the smallest")
    }
}