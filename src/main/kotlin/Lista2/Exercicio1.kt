package Lista2

import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    val limite = 50

    println("Insira a quantidade total de quilos pescados")
    val quilos = scan.nextDouble()

    val excesso = quilos - limite
    val multa = excesso * 4

    if(quilos > 50){
        println("Você pescou %.1f quilos além do limite, e pagará uma multa de R$ %.2f".format(excesso, multa))
    }else{
        println("Você pescou abaixo do limite estabelecido")
    }
}

