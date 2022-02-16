package Lista1

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)

    println("Digite as horas trabalhadas")
    val a = scan.nextDouble()
    println("Digite o quanto você ganha por hora")
    val b = scan.nextDouble()

    val soma = a * b;

    println("Esse mês você irá ganhar $soma reais")
}