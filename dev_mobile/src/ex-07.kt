fun main() {
    println("Digite um numero")
    var numero = readln().toInt()
    print("Quer ver o sucessor ou o antecessor? (1 => sucessor) | (2 => antecessor): ")
    var opcao = readln().toInt()
    if (opcao == 1){
        print("Sucessor de $numero: " + (numero + 1))
    }else{
        print("Antecesssor de $numero: " + (numero - 1))
    }
}