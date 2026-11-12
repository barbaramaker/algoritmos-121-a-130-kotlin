// Código original
// Enunciado:
// Ler três números, os possíveis lados de um triângulo, e imprimir a classificação segundo os ângulos.
//
// prog se35
// real a, b, c, maior, lados;
// imprima "\ndigite 1 lado: ";
// leia a;
// imprima "\ndigite 2 lado: ";
// leia b;
// imprima "\ndigite 3 lado: ";
// leia c;
// se ( a < b + c && b < a + c && c < a + b )
// {
//   se ( a > b && a > c )
//   { maior <- a ** 2; lados <- b ** 2 + c ** 2; }
//   senao
//   { se ( b > c)
//     { maior <- b ** 2; lados <- a ** 2 + c ** 2; }
//     senao
//     { maior <- c ** 2; lados <- a ** 2 + b ** 2 ; }
//   }
//   se ( maior == lados )
//   { imprima "\nTriângulo retângulo"; }
//   senao
//   { se ( maior > lados )
//     { imprima "\nTriângulo obtusângulo"; }
//     senao
//     { imprima "\nTriângulo acutângulo"; }
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

    print("digite 3 lado: ")
    val c = readLine()?.toDoubleOrNull() ?: return

    if (a < b + c && b < a + c && c < a + b) {
        val maior: Double
        val lados: Double

        if (a > b && a > c) {
            maior = a * a
            lados = (b * b) + (c * c)
        } else if (b > c) {
            maior = b * b
            lados = (a * a) + (c * c)
        } else {
            maior = c * c
            lados = (a * a) + (b * b)
        }

        // Utilizando uma pequena margem de tolerância para comparação de ponto flutuante, se necessário,
        // mas mantendo a lógica exata do original:
        if (maior == lados) {
            println("Triângulo retângulo")
        } else if (maior > lados) {
            println("Triângulo obtusângulo")
        } else {
            println("Triângulo acutângulo")
        }
    } else {
        println("As medidas não formam um triângulo")
    }
}