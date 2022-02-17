package Lista3

fun main(){
    val preco = ArrayList<Double>()
    val n1 = capturarDados("Digite o valor do primeiro produto").nextDouble()
    val n2 = capturarDados("Digite o valor do segundo produto").nextDouble()
    val n3 = capturarDados("Digite o valor do terceiro produto").nextDouble()

    if(n1 < n2 && n1 < n3){
       return println("O produto mais barato é o que custa R$ %.2f".format(n1))
    }
    if(n2 < n1 && n2 < n3){
        return println("O produto mais barato é o que custa R$ %.2f".format(n2))
    }else{
        println("O produto mais barato é o que custa R$ %.2f".format(n3))
    }
}