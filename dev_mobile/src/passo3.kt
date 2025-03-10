/* PASSO 03 - CONDIÇÕES COMPOSTAS */

fun ex01_comparaDoisNumeros() {
    print("Digite o primeiro número: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite o segundo número: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0
    when {
        a > b -> println("O primeiro valor é o maior.")
        b > a -> println("O segundo valor é o maior.")
        else -> println("Não existe valor maior, os dois são iguais.")
    }
}

fun ex02_mediaAlunoComSituacao() {
    print("Digite a primeira nota: ")
    val n1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite a segunda nota: ")
    val n2 = readLine()?.toDoubleOrNull() ?: 0.0
    val media = (n1 + n2) / 2
    println("Média: $media")
    when {
        media <= 4.9 -> println("REPROVADO")
        media in 5.0..6.9 -> println("RECUPERAÇÃO")
        media >= 7.0 -> println("APROVADO")
    }
}

fun ex03_classificaTerreno() {
    print("Largura do terreno (m): ")
    val largura = readLine()?.toDoubleOrNull() ?: 0.0
    print("Comprimento do terreno (m): ")
    val comprimento = readLine()?.toDoubleOrNull() ?: 0.0
    val area = largura * comprimento
    println("Área: $area m²")
    when {
        area < 100 -> println("TERRENO POPULAR")
        area in 100.0..500.0 -> println("TERRENO MASTER")
        area > 500 -> println("TERRENO VIP")
    }
}

fun ex04_reajusteFuncionario() {
    print("Nome do funcionário: ")
    val nome = readLine() ?: ""
    print("Salário: R$")
    val salario = readLine()?.toDoubleOrNull() ?: 0.0
    print("Anos na empresa: ")
    val anos = readLine()?.toIntOrNull() ?: 0
    val novoSalario = when {
        anos <= 3 -> salario * 1.03
        anos in 4..10 -> salario * 1.125
        else -> salario * 1.20
    }
    println("Novo salário de $nome: R$${"%.2f".format(novoSalario)}")
}

fun ex05_tipoTriangulo() {
    print("Segmento 1: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Segmento 2: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0
    print("Segmento 3: ")
    val c = readLine()?.toDoubleOrNull() ?: 0.0
    if (a < b + c && b < a + c && c < a + b) {
        println("Forma um triângulo.")
        if (a == b && b == c) {
            println("Triângulo EQUILÁTERO")
        } else if (a == b || a == c || b == c) {
            println("Triângulo ISÓSCELES")
        } else {
            println("Triângulo ESCALENO")
        }
    } else {
        println("Não forma um triângulo.")
    }
}

fun ex06_jokenpo() {
    val opcoes = arrayOf("Pedra", "Papel", "Tesoura")
    println("Escolha: Pedra, Papel ou Tesoura?")
    val jogador = readLine()?.capitalize() ?: ""
    val computador = opcoes.random()
    println("Computador escolheu: $computador")
    if (jogador == computador) {
        println("Empate!")
    } else if ((jogador == "Pedra" && computador == "Tesoura") ||
               (jogador == "Papel" && computador == "Pedra") ||
               (jogador == "Tesoura" && computador == "Papel")) {
        println("Você ganhou!")
    } else {
        println("Você perdeu!")
    }
}

fun ex07_adivinhaNumero() {
    val numeroSorteado = (1..5).random()
    print("Tente adivinhar o número (entre 1 e 5): ")
    val palpite = readLine()?.toIntOrNull() ?: 0
    if (palpite == numeroSorteado) {
        println("Acertou!")
    } else {
        println("Errou! O número era $numeroSorteado")
    }
}

fun ex08_emprestimoCasa() {
    print("Valor da casa: R$")
    val valorCasa = readLine()?.toDoubleOrNull() ?: 0.0
    print("Salário do comprador: R$")
    val salario = readLine()?.toDoubleOrNull() ?: 0.0
    print("Anos para pagar: ")
    val anos = readLine()?.toIntOrNull() ?: 0
    val prestacao = valorCasa / (anos * 12)
    println("Prestação mensal: R$${"%.2f".format(prestacao)}")
    if (prestacao > salario * 0.30) {
        println("Empréstimo negado.")
    } else {
        println("Empréstimo aprovado.")
    }
}

fun ex09_imc() {
    print("Peso (kg): ")
    val peso = readLine()?.toDoubleOrNull() ?: 0.0
    print("Altura (m): ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0
    val imc = peso / (altura * altura)
    println("IMC: ${"%.2f".format(imc)}")
    when {
        imc < 18.5 -> println("Abaixo do peso")
        imc < 25 -> println("Peso ideal")
        imc < 30 -> println("Sobrepeso")
        imc < 40 -> println("Obesidade")
        else -> println("Obesidade mórbida")
    }
}

fun ex10_aluguelCarro() {
    print("Tipo de carro (popular/luxo): ")
    val tipo = readLine()?.toLowerCase() ?: "popular"
    print("Dias alugados: ")
    val dias = readLine()?.toIntOrNull() ?: 0
    print("Km percorridos: ")
    val km = readLine()?.toDoubleOrNull() ?: 0.0
    val valor = if (tipo == "popular") {
        val diaria = dias * 90
        val kmValor = if (km <= 100) km * 0.20 else km * 0.10
        diaria + kmValor
    } else {
        val diaria = dias * 150
        val kmValor = if (km <= 200) km * 0.30 else km * 0.25
        diaria + kmValor
    }
    println("Valor a pagar: R$${"%.2f".format(valor)}")
}

fun ex11_pontosAtividade() {
    print("Horas de atividade no mês: ")
    val horas = readLine()?.toDoubleOrNull() ?: 0.0
    val pontos = when {
        horas <= 10 -> horas * 2
        horas <= 20 -> horas * 5
        else -> horas * 10
    }
    val dinheiro = pontos * 0.05
    println("Pontos ganhos: $pontos")
    println("Dinheiro faturado: R$${"%.2f".format(dinheiro)}")
}

fun ex12_reajusteFuncionarioAvancado() {
    print("Salário: R$")
    val salario = readLine()?.toDoubleOrNull() ?: 0.0
    print("Gênero (M/F): ")
    val genero = readLine()?.toUpperCase() ?: "M"
    print("Anos na empresa: ")
    val anos = readLine()?.toIntOrNull() ?: 0
    val novoSalario = if (genero == "F") {
        when {
            anos < 15 -> salario * 1.05
            anos in 15..20 -> salario * 1.12
            else -> salario * 1.23
        }
    } else {
        when {
            anos < 20 -> salario * 1.03
            anos in 20..30 -> salario * 1.13
            else -> salario * 1.25
        }
    }
    println("Novo salário: R$${"%.2f".format(novoSalario)}")
}
