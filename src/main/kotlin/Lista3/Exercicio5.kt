package Lista3

fun main(){
    val escolha = capturarDados("Digite o numero da semana").nextInt()
    when(escolha){
        1 -> println("Segunda-Feira")
        2 -> println("Terça-Feira")
        3 -> println("Quarta-Feira")
        4 -> println("Quinta-Feira")
        5 -> println("Sexta-Feira")
        6 -> println("Sábado")
        7 -> println("Domingo")
        else -> println("Valor inválido")
    }
}