package Lista1
import java.util.*

fun main(){
    val scan = Scanner(System.`in`)

    println("Digite a nota do primeiro bimestre")
    val a = scan.nextDouble()
    println("Digite a nota do segundo bimestre")
    val b = scan.nextDouble()
    println("Digite a nota do terceiro bimestre")
    val c = scan.nextDouble()
    println("Digite a nota do quarto bimestre")
    val d = scan.nextDouble()

    val soma = a + b + c + d
    val media = soma /4

    println("A média de suas notas são: $media")
}

