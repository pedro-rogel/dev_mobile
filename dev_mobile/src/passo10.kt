/* PASSO 10 - FUNÇÕES */

fun somadorFuncao(a: Double, b: Double): Double {
    return a + b
}

fun mediaFuncao(nota1: Double, nota2: Double): Double {
    return (nota1 + nota2) / 2
}

fun maiorFuncao(a: Double, b: Double, c: Double): Double {
    return maxOf(a, b, c)
}

fun superSomadorFuncao(a: Int, b: Int): Int {
    val (start, end) = if (a <= b) a to b else b to a
    var soma = 0
    for (i in start..end) {
        soma += i
    }
    return soma
}

fun potenciaFuncao(base: Double, expoente: Int): Double {
    return Math.pow(base, expoente.toDouble())
}

fun situacaoAluno(media: Double): String {
    return when {
        media >= 7 -> "APROVADO"
        media >= 5 -> "RECUPERAÇÃO"
        else -> "REPROVADO"
    }
}
