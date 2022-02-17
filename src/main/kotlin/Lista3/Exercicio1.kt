package Lista3

import java.util.Scanner

fun capturarDados(mensagem:String): Scanner{
    println(mensagem)
    return Scanner(System.`in`)
}

fun main(){
    val n1 = capturarDados("Digite o primeiro numero").nextDouble()
    val n2 = capturarDados("Digite o segundo numero").nextDouble()

    if(n1 > n2){
        println("O maior número é $n1")
    }else{
        println("O maior número é $n2")
    }
}