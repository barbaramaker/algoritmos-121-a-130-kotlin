// Código original
// Enunciado:
// Ler um número e imprimir se ele é igual a 5, a 200, a 400, se está no intervalo entre 500 e 1000, inclusive, ou se ele está fora dos escopos anteriores.
//
// prog se37
// real x;
// imprima "\nDigite valor de X: ";
// leia x ;
// se ( x == 5. )
// { imprima "\nO número é o 5"; }
// senao
// { se ( x == 200. )
//   { imprima "\nO número é o 200"; }
//   senao
//   { se ( x == 400. )
//     { imprima "O número é o 400"; }
//     senao
//     { se ( x >= 500. && x <= 1000.)
//       { imprima "\nlntervalo 500-1000"; }
//       senao
//       { imprima "\nFora do escopo"; }
//     }
//   }
// }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite valor de X: ")
    val x = readLine()?.toDoubleOrNull() ?: return

    if (x == 5.0) {
        println("O número é o 5")
    } else if (x == 200.0) {
        println("O número é o 200")
    } else if (x == 400.0) {
        println("O número é o 400")
    } else if (x in 500.0..1000.0) {
        println("Intervalo 500-1000")
    } else {
        println("Fora do escopo")
    }
}