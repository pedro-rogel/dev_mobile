/* PASSO 05 - ENQUANTO COM FLAG */

fun ex01_somaComFlag() {
    var soma = 0
    while (true) {
        print("Digite um número (1111 para parar): ")
        val num = readLine()?.toIntOrNull() ?: 0
        if (num == 1111) break
        soma += num
    }
    println("Somatório: $soma")
}

fun ex02_totalSalariosFuncionarios() {
    var totalHomens = 0.0
    var totalMulheres = 0.0
    while (true) {
        print("Digite o salário do funcionário: R$")
        val salario = readLine()?.toDoubleOrNull() ?: 0.0
        print("Digite o sexo (M/F): ")
        val sexo = readLine()?.toUpperCase() ?: "M"
        if (sexo == "M") totalHomens += salario else totalMulheres += salario
        print("Deseja continuar? (S/N): ")
        val resposta = readLine()?.toUpperCase() ?: "N"
        if (resposta != "S") break
    }
    println("Total pago aos homens: R$${"%.2f".format(totalHomens)}")
    println("Total pago às mulheres: R$${"%.2f".format(totalMulheres)}")
}

fun ex03_estatisticaAlunos() {
    val idades = mutableListOf<Int>()
    while (true) {
        print("Digite a idade do aluno (999 para parar): ")
        val idade = readLine()?.toIntOrNull() ?: 0
        if (idade == 999) break
        idades.add(idade)
    }
    println("Total de alunos: ${idades.size}")
    println("Média de idade: ${"%.2f".format(idades.average())}")
}

fun ex04_estatisticaSexoIdade() {
    val idadesHomens = mutableListOf<Int>()
    val idadesMulheres = mutableListOf<Int>()
    var maiorIdade = 0
    var menorMulher = Int.MAX_VALUE
    while (true) {
        print("Digite o sexo (M/F): ")
        val sexo = readLine()?.toUpperCase() ?: "M"
        print("Digite a idade: ")
        val idade = readLine()?.toIntOrNull() ?: 0
        if (sexo == "M") {
            idadesHomens.add(idade)
        } else {
            idadesMulheres.add(idade)
            if (idade < menorMulher) menorMulher = idade
        }
        if (idade > maiorIdade) maiorIdade = idade
        print("Deseja continuar? (S/N): ")
        val resposta = readLine()?.toUpperCase() ?: "N"
        if (resposta != "S") break
    }
    val mediaHomens = if (idadesHomens.isNotEmpty()) idadesHomens.average() else 0.0
    println("Maior idade lida: $maiorIdade")
    println("Total de homens cadastrados: ${idadesHomens.size}")
    println("Idade da mulher mais jovem: ${if (menorMulher == Int.MAX_VALUE) "N/A" else menorMulher}")
    println("Média de idade dos homens: ${"%.2f".format(mediaHomens)}")
}

fun ex05_estatisticaNomeIdadeSexo() {
    var nomeMaisVelho = ""
    var idadeMaisVelho = 0
    var nomeMulherMaisJovem = ""
    var idadeMulherMaisJovem = Int.MAX_VALUE
    val todasIdades = mutableListOf<Int>()
    var homensAcima30 = 0
    var mulheresAbaixo18 = 0
    while (true) {
        print("Digite o nome: ")
        val nome = readLine() ?: ""
        print("Digite a idade: ")
        val idade = readLine()?.toIntOrNull() ?: 0
        print("Digite o sexo (M/F): ")
        val sexo = readLine()?.toUpperCase() ?: "M"
        todasIdades.add(idade)
        if (idade > idadeMaisVelho) {
            idadeMaisVelho = idade
            nomeMaisVelho = nome
        }
        if (sexo == "F") {
            if (idade < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idade
                nomeMulherMaisJovem = nome
            }
            if (idade < 18) mulheresAbaixo18++
        } else {
            if (idade > 30) homensAcima30++
        }
        print("Deseja continuar? (S/N): ")
        val resposta = readLine()?.toUpperCase() ?: "N"
        if (resposta != "S") break
    }
    println("Pessoa mais velha: $nomeMaisVelho")
    println("Mulher mais jovem: ${if (nomeMulherMaisJovem.isEmpty()) "N/A" else nomeMulherMaisJovem}")
    println("Média de idade do grupo: ${"%.2f".format(todasIdades.average())}")
    println("Homens com mais de 30 anos: $homensAcima30")
    println("Mulheres com menos de 18 anos: $mulheresAbaixo18")
}
