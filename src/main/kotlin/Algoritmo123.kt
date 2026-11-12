// Código original
// Enunciado:
// Ler três números, os possíveis lados de um triângulo, e imprimir a classificação segundo os lados.
//
// prog se34
// real a, b, c;
// imprima "\ndigite 1 lado: ";
// leia a;
// imprima "\ndigite 2 lado: ";
// leia b;
// imprima "\ndigite 3 lado: ";
// leia c;
// se (a < b + c && b < a + c && c < a + b)
// {
//   se (a == b && a == c)
//   { imprima "\nTriângulo equilátero"; }
//   senao
//   {
//     se (a == b || a == c || b == c)
//     { imprima "\nTriângulo isósceles"; }
//     senao
//     { imprima "\nTriângulo escaleno"; }
//   }
// }
// senao
// { imprima "\nAs medidas não formam um triângulo"; }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite 1 lado: ")
    val a = readLine()?.toDoubleOrNull() ?: return

    print("Digite 2 lado: ")
    val b = readLine()?.toDoubleOrNull() ?: return

    print("Digite 3 lado: ")
    val c = readLine()?.toDoubleOrNull() ?: return

    if (a < b + c && b < a + c && c < a + b) {
        if (a == b && b == c) {
            println("Triângulo equilátero")
        } else if (a == b || a == c || b == c) {
            println("Triângulo isósceles")
        } else {
            println("Triângulo escaleno")
        }
    } else {
        println("As medidas não formam um triângulo")
    }
}