// (Conteúdo de PASSO09.kt – veja o exemplo acima)
fun Gerador() { println("+=======+"); println("Olá, Mundo!"); println("+=======+") }
fun Gerador(msg: String) { println("+=======+"); println(msg); println("+=======+") }
fun Gerador(msg: String, vezes: Int) { println("+=======+"); repeat(vezes) { println(msg) } ; println("+=======+") }
fun Gerador(msg: String, vezes: Int, tipoBorda: Int) { val borda = when(tipoBorda) { 1 -> "+-------=======++"; 2 -> "~~~~~~~~:::::::~~~~~~~"; 3 -> "<<<<<<<<------->>>>>>>" else -> "+=======+" }; println(borda); repeat(vezes) { println(msg) } ; println(borda) }
fun Somador(a: Double, b: Double) { println("Soma: ${a + b}") }
fun Maior(a: Double, b: Double) { if (a > b) { println("Maior: $a") } else if (b > a) { println("Maior: $b") } else { println("Os valores são iguais.") } }
fun ParOuImpar(n: Int) { if (n % 2 == 0) { println("$n é PAR") } else { println("$n é ÍMPAR") } }
fun Contador(inicio: Int, fim: Int, incremento: Int) { var i = inicio; while (if (inicio <= fim) i <= fim else i >= fim) { print("$i >> "); i += if (inicio <= fim) incremento else -incremento } ; println("FIM") }
fun Fibonacci(termos: Int) { var a = 1; var b = 1; print("$a >> $b >> "); for (i in 3..termos) { val c = a + b; print("$c >> "); a = b; b = c } ; println("FIM") }