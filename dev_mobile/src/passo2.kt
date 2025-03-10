/* PASSO 02 - CONDIÇÕES BÁSICAS */

import java.time.LocalDate

fun ex01_verificaVelocidade() {
    print("Qual a velocidade do carro (Km/h)? ")
    val velocidade = readLine()?.toDoubleOrNull() ?: 0.0
    if (velocidade > 80) {
        val multa = (velocidade - 80) * 5
        println("Você foi multado! Valor da multa: R$${"%.2f".format(multa)}")
    } else {
        println("Velocidade dentro do limite.")
    }
}

fun ex02_podeVotar() {
    print("Digite o ano de nascimento: ")
    val anoNascimento = readLine()?.toIntOrNull() ?: 0
    val anoAtual = LocalDate.now().year
    val idade = anoAtual - anoNascimento
    println("Idade: $idade")
    if (idade >= 16) {
        println("Você pode votar.")
    } else {
        println("Você não pode votar.")
    }
}

fun ex03_mediaAlunoCondicional() {
    print("Nome do aluno: ")
    val nome = readLine() ?: ""
    print("Nota 1: ")
    val n1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Nota 2: ")
    val n2 = readLine()?.toDoubleOrNull() ?: 0.0
    val media = (n1 + n2) / 2
    println("Média: $media")
    if (media >= 7.0) {
        println("Bom aproveitamento!")
    } else {
        println("Aproveitamento abaixo do esperado.")
    }
}

fun ex04_parImpar() {
    print("Digite um número inteiro: ")
    val num = readLine()?.toIntOrNull() ?: 0
    if (num % 2 == 0) {
        println("$num é PAR")
    } else {
        println("$num é ÍMPAR")
    }
}

fun ex05_anoBissexto() {
    print("Digite um ano: ")
    val ano = readLine()?.toIntOrNull() ?: 0
    val bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)
    if (bissexto) {
        println("$ano é bissexto.")
    } else {
        println("$ano não é bissexto.")
    }
}

fun ex06_alistamentoMilitar() {
    print("Digite o ano de nascimento: ")
    val anoNascimento = readLine()?.toIntOrNull() ?: 0
    val anoAtual = LocalDate.now().year
    val idade = anoAtual - anoNascimento
    println("Idade: $idade")
    when {
        idade < 18 -> println("Faltam ${18 - idade} anos para o alistamento.")
        idade == 18 -> println("Alistamento neste ano.")
        else -> println("Já se passaram ${idade - 18} anos do alistamento.")
    }
}

fun ex07_descontoDiaMulher() {
    print("Nome: ")
    val nome = readLine() ?: ""
    print("Sexo (M/F): ")
    val sexo = readLine()?.toUpperCase() ?: "M"
    print("Valor das compras: R$")
    val valor = readLine()?.toDoubleOrNull() ?: 0.0
    val desconto = if (sexo == "F") 0.13 else 0.05
    val valorFinal = valor * (1 - desconto)
    println("Olá $nome, o valor a pagar com desconto é R$${"%.2f".format(valorFinal)}")
}

fun ex08_precoPassagem() {
    print("Digite a distância em Km: ")
    val km = readLine()?.toDoubleOrNull() ?: 0.0
    val preco = if (km <= 200) km * 0.50 else km * 0.45
    println("Preço da passagem: R$${"%.2f".format(preco)}")
}

fun ex09_tresSegmentosTriangulo() {
    print("Digite o primeiro segmento: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite o segundo segmento: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite o terceiro segmento: ")
    val c = readLine()?.toDoubleOrNull() ?: 0.0
    if (a < b + c && b < a + c && c < a + b) {
        println("Os segmentos podem formar um triângulo.")
    } else {
        println("Os segmentos não podem formar um triângulo.")
    }
}
