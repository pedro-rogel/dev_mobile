/* PASSO 08 - VETORES */

fun ex01_vetor999() {
    val vetor = Array(8) { 999 }
    for (i in vetor.indices) {
        println("Posição $i: ${vetor[i]}")
    }
}

fun ex02_vetorMultiplo5() {
    val vetor = Array(10) { (it + 1) * 5 }
    for (i in vetor.indices) {
        println("Posição $i: ${vetor[i]}")
    }
}

fun ex03_vetorDecrescente() {
    val vetor = Array(10) { 9 - it }
    for (i in vetor.indices) {
        println("Posição $i: ${vetor[i]}")
    }
}

fun ex04_vetorAlternado() {
    val vetor = Array(10) { if (it % 2 == 0) 5 else 3 }
    for (i in vetor.indices) {
        println("Posição $i: ${vetor[i]}")
    }
}

fun ex05_vetorFibonacci() {
    val vetor = Array(15) { 0 }
    vetor[0] = 1
    vetor[1] = 1
    for (i in 2 until 15) {
        vetor[i] = vetor[i-1] + vetor[i-2]
    }
    for (i in vetor.indices) {
        println("Posição $i: ${vetor[i]}")
    }
}

fun ex06_vetorAleatorio7() {
    val vetor = Array(7) { (0..100).random() }
    for (i in vetor.indices) {
        println("Posição $i: ${vetor[i]}")
    }
}

fun ex07_vetorNomes() {
    val nomes = Array(7) { "" }
    for (i in nomes.indices) {
        print("Digite o nome ${i+1}: ")
        nomes[i] = readLine() ?: ""
    }
    println("Nomes na ordem inversa:")
    for (i in nomes.indices.reversed()) {
        println(nomes[i])
    }
}

fun ex08_vetorMultiploDe10() {
    val vetor = Array(15) { 0 }
    for (i in vetor.indices) {
        print("Digite o número na posição $i: ")
        vetor[i] = readLine()?.toIntOrNull() ?: 0
    }
    println("Posições com valores múltiplos de 10:")
    for (i in vetor.indices) {
        if (vetor[i] % 10 == 0) {
            println("Posição $i: ${vetor[i]}")
        }
    }
}

fun ex09_vetorPares() {
    val vetor = Array(10) { 0 }
    for (i in vetor.indices) {
        print("Digite o número na posição $i: ")
        vetor[i] = readLine()?.toIntOrNull() ?: 0
    }
    println("Números pares e suas posições:")
    for (i in vetor.indices) {
        if (vetor[i] % 2 == 0) {
            println("Posição $i: ${vetor[i]}")
        }
    }
}

fun ex10_vetorChave() {
    val vetor = Array(30) { (1..15).random() }
    println("Vetor gerado:")
    println(vetor.joinToString(" "))
    print("Digite a chave para buscar: ")
    val chave = readLine()?.toIntOrNull() ?: 0
    val posicoes = vetor.withIndex().filter { it.value == chave }.map { it.index }
    println("Chave encontrada nas posições: $posicoes")
    println("Total de ocorrências: ${posicoes.size}")
}

fun ex11_vetorIdade8() {
    val idades = Array(8) { 0 }
    for (i in idades.indices) {
        print("Digite a idade na posição $i: ")
        idades[i] = readLine()?.toIntOrNull() ?: 0
    }
    println("Média de idade: ${"%.2f".format(idades.average())}")
    println("Posições com idade > 25:")
    for (i in idades.indices) {
        if (idades[i] > 25) println("Posição $i: ${idades[i]}")
    }
    val maior = idades.maxOrNull() ?: 0
    println("Maior idade: $maior")
    println("Posições da maior idade:")
    for (i in idades.indices) {
        if (idades[i] == maior) println("Posição $i")
    }
}

fun ex12_vetorNotas10() {
    val notas = Array(10) { 0.0 }
    for (i in notas.indices) {
        print("Digite a nota do aluno na posição $i: ")
        notas[i] = readLine()?.toDoubleOrNull() ?: 0.0
    }
    println("Média da turma: ${"%.2f".format(notas.average())}")
    println("Alunos acima da média:")
    for (i in notas.indices) {
        if (notas[i] > notas.average()) println("Posição $i: ${notas[i]}")
    }
    val maior = notas.maxOrNull() ?: 0.0
    println("Maior nota: $maior")
    println("Posições da maior nota:")
    for (i in notas.indices) {
        if (notas[i] == maior) println("Posição $i")
    }
}

fun ex13_vetorAleatorioOrdenado() {
    val vetor = Array(20) { (0..99).random() }
    println("Números gerados:")
    println(vetor.joinToString(" "))
    val ordenado = vetor.sorted()
    println("Números em ordem crescente:")
    println(ordenado.joinToString(" "))
}

fun ex14_vetorNomeIdade9() {
    val nomes = Array(9) { "" }
    val idades = Array(9) { 0 }
    for (i in 0 until 9) {
        print("Digite o nome da pessoa ${i+1}: ")
        nomes[i] = readLine() ?: ""
        print("Digite a idade da pessoa ${i+1}: ")
        idades[i] = readLine()?.toIntOrNull() ?: 0
    }
    println("Pessoas menores de idade:")
    for (i in 0 until 9) {
        if (idades[i] < 18) {
            println("Nome: ${nomes[i]}, Idade: ${idades[i]}")
        }
    }
}

fun ex15_vetorFuncionarias() {
    val nomes = Array(5) { "" }
    val sexos = Array(5) { "" }
    val salarios = Array(5) { 0.0 }
    for (i in 0 until 5) {
        print("Digite o nome do funcionário ${i+1}: ")
        nomes[i] = readLine() ?: ""
        print("Digite o sexo (M/F) do funcionário ${i+1}: ")
        sexos[i] = readLine()?.toUpperCase() ?: "M"
        print("Digite o salário do funcionário ${i+1}: R$")
        salarios[i] = readLine()?.toDoubleOrNull() ?: 0.0
    }
    println("Funcionárias que ganham mais de R$5000:")
    for (i in 0 until 5) {
        if (sexos[i] == "F" && salarios[i] > 5000) {
            println("Nome: ${nomes[i]}, Salário: R$${salarios[i]}")
        }
    }
}
