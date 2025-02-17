fun main() {
    print("Digite quantos reais vc tem na carteira: ")
    var carteira = readln().toDouble()
    var dolarEmReal = 3.45
    var conversao = carteira / dolarEmReal
    println("Voçê consegue comprar $conversao com R$$carteira reais")
}