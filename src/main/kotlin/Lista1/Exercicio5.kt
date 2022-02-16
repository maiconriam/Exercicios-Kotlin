package Lista1

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)

    println("Digite a temperatura em graus Fahrenheit")
    val a = scan.nextDouble()

    val celsius = (a - 32) / 1.8

    print("A temperatura em Fahrenheit é $a ºF e convertida para celsius é %.2f".format(celsius))
}