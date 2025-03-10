/* PASSO 06 - REPETIÇÃO COM FAÇA ENQUANTO */

fun ex01_contagemDoWhile() {
    var i = 0
    do {
        print("$i ")
        i += 3
    } while (i <= 30)
    println("Acabou!")
}

fun ex02_estatisticaIdadeDoWhile() {
    var soma = 0
    var count = 0
    var acima21 = 0
    var idade: Int
    do {
        print("Digite uma idade: ")
        idade = readLine()?.toIntOrNull() ?: 0
        soma += idade
        count++
        if (idade >= 21) acima21++
        print("Deseja continuar? (S/N): ")
    } while (readLine()?.toUpperCase() == "S")
    println("Total de idades: $count")
    println("Média: ${"%.2f".format(soma.toDouble() / count)}")
    println("Pessoas com 21 anos ou mais: $acima21")
}

fun ex03_estatisticaNumerosDoWhile() {
    var soma = 0
    var count = 0
    var min: Int? = null
    var pares = 0
    var num: Int
    do {
        print("Digite um número: ")
        num = readLine()?.toIntOrNull() ?: 0
        soma += num
        count++
        if (min == null || num < min) min = num
        if (num % 2 == 0) pares++
        print("Deseja continuar? (S/N): ")
    } while (readLine()?.toUpperCase() == "S")
    println("Somatório: $soma")
    println("Menor valor: $min")
    println("Média: ${"%.2f".format(soma.toDouble() / count)}")
    println("Quantidade de números pares: $pares")
}
