/* PASSO 01 - SEQUÊNCIAS BÁSICAS */

fun ex01_olaMundo() {
    println("Olá, Mundo!")
}

fun ex02_boasVindas() {
    print("Qual é o seu nome? ")
    val nome = readLine() ?: ""
    println("Olá $nome, é um prazer te conhecer!")
}

fun ex03_salarioFuncionario() {
    print("Nome do Funcionário: ")
    val nome = readLine() ?: ""
    print("Salário: ")
    val salario = readLine()?.toDoubleOrNull() ?: 0.0
    println("O funcionário $nome tem um salário de R$$salario em Junho.")
}

fun ex04_soma() {
    print("Digite um valor: ")
    val a = readLine()?.toIntOrNull() ?: 0
    print("Digite outro valor: ")
    val b = readLine()?.toIntOrNull() ?: 0
    println("A soma entre $a e $b é igual a ${a + b}.")
}

fun ex05_mediaAluno() {
    print("Nota 1: ")
    val n1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Nota 2: ")
    val n2 = readLine()?.toDoubleOrNull() ?: 0.0
    val media = (n1 + n2) / 2
    println("A média entre $n1 e $n2 é igual a $media.")
}

fun ex06_antecessorSucessor() {
    print("Digite um número: ")
    val num = readLine()?.toIntOrNull() ?: 0
    println("O antecessor de $num é ${num - 1}")
    println("O sucessor de $num é ${num + 1}")
}

fun ex07_dobroETercaParte() {
    print("Digite um número: ")
    val num = readLine()?.toDoubleOrNull() ?: 0.0
    println("O dobro de $num é ${num * 2}")
    println("A terça parte de $num é ${num / 3}")
}

fun ex08_conversaoMedidas() {
    print("Digite uma distância em metros: ")
    val metros = readLine()?.toDoubleOrNull() ?: 0.0
    println("A distância de $metros m corresponde a:")
    println("${metros / 1000} Km")
    println("${metros / 100} Hm")
    println("${metros / 10} Dam")
    println("${metros * 10} dm")
    println("${metros * 100} cm")
    println("${metros * 1000} mm")
}

fun ex09_dolar() {
    print("Quanto dinheiro você tem na carteira (R$)? ")
    val reais = readLine()?.toDoubleOrNull() ?: 0.0
    val dolares = reais / 3.45
    println("Com R$$reais você pode comprar US$${"%.2f".format(dolares)}.")
}

fun ex10_tinta() {
    print("Largura da parede (m): ")
    val largura = readLine()?.toDoubleOrNull() ?: 0.0
    print("Altura da parede (m): ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0
    val area = largura * altura
    val tinta = area / 2
    println("Área da parede: $area m²")
    println("Quantidade de tinta necessária: ${"%.2f".format(tinta)} litros")
}

fun ex11_delta() {
    print("Valor de A: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Valor de B: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0
    print("Valor de C: ")
    val c = readLine()?.toDoubleOrNull() ?: 0.0
    val delta = b * b - 4 * a * c
    println("O valor de Delta é $delta")
}

fun ex12_descontoProduto() {
    print("Preço do produto: R$")
    val preco = readLine()?.toDoubleOrNull() ?: 0.0
    val precoPromo = preco * 0.95
    println("Preço promocional: R$${"%.2f".format(precoPromo)}")
}

fun ex13_aumentoSalario() {
    print("Salário do funcionário: R$")
    val salario = readLine()?.toDoubleOrNull() ?: 0.0
    val novoSalario = salario * 1.15
    println("Novo salário com 15% de aumento: R$${"%.2f".format(novoSalario)}")
}

fun ex14_locadora() {
    print("Km percorridos: ")
    val km = readLine()?.toDoubleOrNull() ?: 0.0
    print("Dias alugados: ")
    val dias = readLine()?.toIntOrNull() ?: 0
    val valor = dias * 90 + km * 0.20
    println("Valor total a pagar: R$${"%.2f".format(valor)}")
}

fun ex15_salarioTrabalhado() {
    print("Dias trabalhados no mês: ")
    val dias = readLine()?.toIntOrNull() ?: 0
    val salario = dias * 8 * 25.0
    println("Salário do funcionário: R$${"%.2f".format(salario)}")
}

fun ex16_fumante() {
    print("Quantidade de cigarros fumados por dia: ")
    val cigarroPorDia = readLine()?.toIntOrNull() ?: 0
    print("Anos fumando: ")
    val anos = readLine()?.toIntOrNull() ?: 0
    val totalCigarros = cigarroPorDia * 365 * anos
    val minutosPerdidos = totalCigarros * 10
    val diasPerdidos = minutosPerdidos / (60.0 * 24)
    println("Você perdeu aproximadamente ${"%.2f".format(diasPerdidos)} dias de vida.")
}
