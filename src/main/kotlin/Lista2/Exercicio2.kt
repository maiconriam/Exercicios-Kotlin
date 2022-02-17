package Lista2

import java.util.Scanner
import kotlin.math.ceil

fun main(){
    val scan = Scanner(System.`in`)
    println("Insira o tamanho da área a ser pintada")
    val area = scan.nextDouble();
    println("1- Latas 18L (R$80,00)\n2- Galões 3,6L (R$ 25,00)")
    val escolha = scan.nextInt()
    when(escolha){
        1 -> calculoLata(area)
        2 -> calculoGalao(area)
    }
}

fun calculoLata(area:Double){
    val preco = 80
    val cobertura = 18 * 6
    val quantidadeNecessaria = ceil(area/cobertura)
    val precoFinal = quantidadeNecessaria * preco
    println("Será necessário comprar %.0f latas de tinta, que custará R$ %.2f".format(quantidadeNecessaria, precoFinal))
}

fun calculoGalao(area: Double){
    val preco = 25
    val cobertura = 3.6 * 6
    val quantidadeNecessaria = ceil(area/cobertura)
    val precoFinal = quantidadeNecessaria * preco
    println("Será necessário comprar %.0f galões de tinta, que custará R$ %.2f".format(quantidadeNecessaria, precoFinal))
}
