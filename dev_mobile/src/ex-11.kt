/*• Faça um algoritmo que leia a largura e altura de uma parede,
calcule e mostre a área a ser pintada e a quantidade de tinta
necessária para o serviço, sabendo que cada litro de tinta pinta
uma área de 2metros quadrados.*/

fun main(){
    println('Digite a largura da parede: ')
    val largura = readline().toFloat()
    println('Digite a altura da parede: ')
    val altura = readline().toFloat()
    val area = altura + largura;
    val litroTinta = 2
    val resultado = area * litroTinta;
    return resultado

}

println("A quantidade de tinta necessária para pintar a parede de $largura ")