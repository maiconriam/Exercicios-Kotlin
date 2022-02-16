package Lista1

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)

    println("Quanto você ganha por hora?")
    val a = scan.nextDouble()
    println("Quantas horas você trabalhou este mês?")
    val b = scan.nextDouble()

    val salarioBruto = a * b
    val inss = salarioBruto * 0.08
    val sindicato = salarioBruto * 0.05
    val ir = salarioBruto * 0.11
    val liquido = salarioBruto - inss - sindicato - ir

    println("Salário bruto é: R$ %.2f".format(salarioBruto))
    println("Você pago ao INSS: R$ %.2f".format(inss))
    println("Você pago ao sindicato: R$ %.2f".format(sindicato))
    println("Você pago de imposto de renda: R$ %.2f".format(ir))
    println("Seu salário líquido é: R$ %.2f".format(liquido))
}