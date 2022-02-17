package Lista3

fun main(){
    val n1 = capturarDados("Digite o valor da primeira nota").nextDouble()
    val n2 = capturarDados("Digite o valor da segunda nota").nextDouble()

    val media = (n1 + n2) / 2

    if(media >=7 && media < 10)
        println("Aprovado")
    else if(media == 10.0)
        println("Aprovado com distinção")
    else
        println("Reprovado")

}