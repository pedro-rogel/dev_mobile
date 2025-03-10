/* PASSO 07 - REPETIÇÃO COM PARA */

fun ex01_contagemForCrescente5() {
    for (i in 0..40 step 5) {
        print("$i ")
    }
    println("Acabou!")
}

fun ex02_contagemForDecrescente10() {
    for (i in 100 downTo 0 step 10) {
        print("$i ")
    }
    println("Acabou!")
}

fun ex03_tabuada() {
    print("Digite um valor para a tabuada: ")
    val valor = readLine()?.toIntOrNull() ?: 0
    for (i in 1..10) {
        println("$valor x $i = ${valor * i}")
    }
}

fun ex04_contagemForAteValor() {
    print("Digite um valor: ")
    val valor = readLine()?.toIntOrNull() ?: 0
    for (i in 0..valor) {
        print("$i ")
    }
    println("FIM!")
}

fun ex05_estatisticaSexoPeso8Pessoas() {
    var mulheres = 0
    var homensAcima100 = 0
    var somaPesoMulheres = 0.0
    var countMulheres = 0
    var maiorPesoHomens = 0.0
    for (i in 1..8) {
        print("Pessoa $i - Digite o sexo (M/F): ")
        val sexo = readLine()?.toUpperCase() ?: "M"
        print("Pessoa $i - Digite o peso (kg): ")
        val peso = readLine()?.toDoubleOrNull() ?: 0.0
        if (sexo == "F") {
            mulheres++
            somaPesoMulheres += peso
            countMulheres++
        } else {
            if (peso > 100) homensAcima100++
            if (peso > maiorPesoHomens) maiorPesoHomens = peso
        }
    }
    val mediaPesoMulheres = if (countMulheres > 0) somaPesoMulheres / countMulheres else 0.0
    println("Mulheres cadastradas: $mulheres")
    println("Homens com mais de 100kg: $homensAcima100")
    println("Média de peso das mulheres: ${"%.2f".format(mediaPesoMulheres)}")
    println("Maior peso entre os homens: $maiorPesoHomens")
}

fun ex06_pa() {
    print("Digite o primeiro termo: ")
    val primeiro = readLine()?.toIntOrNull() ?: 0
    print("Digite a razão: ")
    val razao = readLine()?.toIntOrNull() ?: 0
    var soma = 0
    print("PA: ")
    for (i in 0 until 10) {
        val termo = primeiro + i * razao
        print("$termo ")
        soma += termo
    }
    println("\nSoma dos 10 termos: $soma")
}

fun ex07_fibonacciFor() {
    var a = 1
    var b = 1
    print("Sequência de Fibonacci: $a $b ")
    for (i in 3..10) {
        val c = a + b
        print("$c ")
        a = b
        b = c
    }
    println("FIM")
}
