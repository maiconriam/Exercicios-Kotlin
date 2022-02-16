package Lista1

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    println("Digite os metros para converte para centímetros")
    val a = scan.nextDouble()

    val metros = a * 100;

    println("$a metros equivale a $metros centímetros")
}