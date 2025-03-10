/* PASSO 04 - REPETIÇÕES ENQUANTO */

fun ex01_contagemCrescente() {
    var i = 6
    while (i <= 11) {
        print("$i ")
        i++
    }
    println("Acabou!")
}

fun ex02_contagemDecrescente() {
    var i = 10
    while (i >= 3) {
        print("$i ")
        i--
    }
    println("Acabou!")
}

fun ex03_contagemIncrementoTres() {
    var i = 0
    while (i <= 18) {
        print("$i ")
        i += 3
    }
    println("Acabou!")
}

fun ex04_contagemDecrementoCinco() {
    var i = 100
    while (i >= 0) {
        print("$i ")
        i -= 5
    }
    println("Acabou!")
}

fun ex05_contagemAteValor() {
    print("Digite um valor inteiro positivo: ")
    val valor = readLine()?.toIntOrNull() ?: 0
    var i = 1
    while (i <= valor) {
        print("$i ")
        i++
    }
    println("Acabou!")
}

fun ex06_contagemRegressivaDivisiveisPor4() {
    var i = 30
    while (i >= 1) {
        if (i % 4 == 0) {
            print("[$i] ")
        } else {
            print("$i ")
        }
        i--
    }
    println()
}

fun ex07_contagemIntervalo() {
    print("Digite o primeiro valor: ")
    val inicio = readLine()?.toIntOrNull() ?: 0
    print("Digite o último valor: ")
    val fim = readLine()?.toIntOrNull() ?: 0
    print("Digite o incremento: ")
    val incremento = readLine()?.toIntOrNull() ?: 1
    if (inicio <= fim) {
        var i = inicio
        while (i <= fim) {
            print("$i ")
            i += incremento
        }
    } else {
        var i = inicio
        while (i >= fim) {
            print("$i ")
            i -= incremento
        }
    }
    println("Acabou!")
}

fun ex08_somaPares() {
    var soma = 0
    var i = 6
    while (i <= 100) {
        if (i % 2 == 0) soma += i
        i += 2
    }
    println("Soma: $soma")
}

fun ex09_somaExpressao() {
    var soma = 0
    var i = 500
    while (i >= 0) {
        soma += i
        i -= 50
    }
    println("Soma: $soma")
}

fun ex10_somaSeteNumeros() {
    var soma = 0
    var count = 1
    while (count <= 7) {
        print("Digite o número $count: ")
        val num = readLine()?.toIntOrNull() ?: 0
        soma += num
        count++
    }
    println("Somatório: $soma")
}

fun ex11_contagemParesImpares() {
    var pares = 0
    var impares = 0
    var count = 1
    while (count <= 6) {
        print("Digite o número $count: ")
        val num = readLine()?.toIntOrNull() ?: 0
        if (num % 2 == 0) pares++ else impares++
        count++
    }
    println("Pares: $pares, Ímpares: $impares")
}

fun ex12_sorteioNumeros() {
    val numeros = mutableListOf<Int>()
    repeat(20) {
        numeros.add((0..10).random())
    }
    println("Números sorteados: $numeros")
    val acima5 = numeros.count { it > 5 }
    val divisiveis3 = numeros.count { it % 3 == 0 }
    println("Números acima de 5: $acima5")
    println("Números divisíveis por 3: $divisiveis3")
}

fun ex13_maiorMenorPrecos() {
    val precos = mutableListOf<Double>()
    var count = 1
    while (count <= 8) {
        print("Digite o preço do produto $count: R$")
        val preco = readLine()?.toDoubleOrNull() ?: 0.0
        precos.add(preco)
        count++
    }
    println("Maior preço: R$${precos.maxOrNull()}")
    println("Menor preço: R$${precos.minOrNull()}")
}

fun ex14_estatisticaIdades10Pessoas() {
    val idades = mutableListOf<Int>()
    var count = 1
    while (count <= 10) {
        print("Digite a idade da pessoa $count: ")
        val idade = readLine()?.toIntOrNull() ?: 0
        idades.add(idade)
        count++
    }
    val media = idades.average()
    println("Média de idade: ${"%.2f".format(media)}")
    println("Pessoas com mais de 18 anos: ${idades.count { it > 18 }}")
    println("Pessoas com menos de 5 anos: ${idades.count { it < 5 }}")
    val maiorIdade = idades.maxOrNull() ?: 0
    println("Maior idade: $maiorIdade")
    println("Posições da maior idade: ${idades.withIndex().filter { it.value == maiorIdade }.map { it.index }}")
}

fun ex15_estatisticaIdadeSexo5Pessoas() {
    val idades = mutableListOf<Int>()
    val sexos = mutableListOf<String>()
    var count = 1
    while (count <= 5) {
        print("Digite a idade da pessoa $count: ")
        val idade = readLine()?.toIntOrNull() ?: 0
        idades.add(idade)
        print("Digite o sexo da pessoa $count (M/F): ")
        val sexo = readLine() ?: "M"
        sexos.add(sexo.toUpperCase())
        count++
    }
    println("Homens cadastrados: ${sexos.count { it == "M" }}")
    println("Mulheres cadastradas: ${sexos.count { it == "F" }}")
    println("Média de idade do grupo: ${"%.2f".format(idades.average())}")
    val mediaHomens = idades.withIndex().filter { sexos[it.index] == "M" }.map { it.value }.average()
    println("Média de idade dos homens: ${"%.2f".format(mediaHomens)}")
    println("Mulheres com mais de 20 anos: ${idades.withIndex().count { sexos[it.index] == "F" && it.value > 20 }}")
}

fun ex16_estatisticaPesoAltura7Pessoas() {
    val pesos = mutableListOf<Double>()
    val alturas = mutableListOf<Double>()
    var count = 1
    while (count <= 7) {
        print("Digite o peso da pessoa $count (kg): ")
        val peso = readLine()?.toDoubleOrNull() ?: 0.0
        pesos.add(peso)
        print("Digite a altura da pessoa $count (m): ")
        val altura = readLine()?.toDoubleOrNull() ?: 0.0
        alturas.add(altura)
        count++
    }
    println("Média de altura: ${"%.2f".format(alturas.average())}")
    println("Pessoas com mais de 90kg: ${pesos.count { it > 90 }}")
    val countMenor = pesos.zip(alturas).count { it.first < 50 && it.second < 1.60 }
    println("Pessoas com menos de 50kg e menos de 1.60m: $countMenor")
    val countMaior = pesos.zip(alturas).count { it.second > 1.90 && it.first > 100 }
    println("Pessoas com mais de 1.90m e mais de 100kg: $countMaior")
}

fun ex17_desafio_adivinha4Tentativas() {
    val numeroSorteado = (1..10).random()
    var tentativas = 4
    var acertou = false
    while (tentativas > 0 && !acertou) {
        print("Tentativa (${5 - tentativas}/4) - Adivinhe o número: ")
        val palpite = readLine()?.toIntOrNull() ?: 0
        if (palpite == numeroSorteado) {
            println("Parabéns, você acertou!")
            acertou = true
        } else {
            println("Errou!")
        }
        tentativas--
    }
    if (!acertou) println("Número correto era $numeroSorteado")
}
