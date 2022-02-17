package Lista3

fun main(){
    val salarioAtual = capturarDados("Informe o seu salário").nextDouble()
    if(salarioAtual <= 280) {
        val novoSalario = salarioAtual * 0.2
        println("O antigo salário era de R$ %.2f".format(salarioAtual))
        println("O percentual de aumento foi de 20%")
        println("Seu aumento foi de R$ %.2f".format(novoSalario))
        println("Seu novo salário é de R$ %.2f".format(salarioAtual + novoSalario))
    }
    if(salarioAtual > 280 && salarioAtual <= 700){
        val novoSalario = salarioAtual * 0.15
        println("O antigo salário era de R$ %.2f".format(salarioAtual))
        println("O percentual de aumento foi de 15%")
        println("Seu aumento foi de R$ %.2f".format(novoSalario))
        println("Seu novo salário é de R$ %.2f".format(salarioAtual + novoSalario))
    }
    if(salarioAtual > 700 && salarioAtual <= 1500){
        val novoSalario = salarioAtual * 0.1
        println("O antigo salário era de R$ %.2f".format(salarioAtual))
        println("O percentual de aumento foi de 10%")
        println("Seu aumento foi de R$ %.2f".format(novoSalario))
        println("Seu novo salário é de R$ %.2f".format(salarioAtual + novoSalario))
    }
    if(salarioAtual > 1500){
        val novoSalario = salarioAtual * 0.05
        println("O antigo salário era de R$ %.2f".format(salarioAtual))
        println("O percentual de aumento foi de 5%")
        println("Seu aumento foi de R$ %.2f".format(novoSalario))
        println("Seu novo salário é de R$ %.2f".format(salarioAtual + novoSalario))
    }
}