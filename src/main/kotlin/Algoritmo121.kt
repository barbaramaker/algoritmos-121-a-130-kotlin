// Código original
// Enunciado:
// Efetuar a leitura de cinco números inteiros diferentes e identificar o maior e o menor valor.
//
// prog se32
// int n1, n2, n3, n4, n5 , maior, menor;
// ... (validação de números diferentes e comparações sequenciais)
// imprima "\nMaior = ",maior;
// imprima "\nMenor = ",menor;
// senao { imprima "\nOs valores devem ser diferentes "; }
// fimprog

// Código em Kotlin

fun main() {
    print("Digite 1 número: ")
    val n1 = readLine()?.toIntOrNull() ?: return

    print("Digite 2 número: ")
    val n2 = readLine()?.toIntOrNull() ?: return

    print("Digite 3 número: ")
    val n3 = readLine()?.toIntOrNull() ?: return

    print("Digite 4 número: ")
    val n4 = readLine()?.toIntOrNull() ?: return

    print("Digite 5 número: ")
    val n5 = readLine()?.toIntOrNull() ?: return

    val numeros = listOf(n1, n2, n3, n4, n5)

    // Verifica se todos os números são diferentes
    if (numeros.toSet().size == numeros.size) {
        val maior = numeros.maxOrNull()
        val menor = numeros.minOrNull()
        println("Maior = $maior")
        println("Menor = $menor")
    } else {
        println("Os valores devem ser diferentes")
    }
}