// Código original
// Enunciado:
// Entrar com um verbo no infinitivo e imprimir uma das mensagens:
// • Verbo não está no infinitivo
// • Verbo da 1ª conjugação
// • Verbo da 2ª conjugação
// • Verbo da 3ª conjugação
//
// prog se39
// string verbo, letra;
// int n;
// imprima "\ndigite verbo: ";
// leia verbo;
// letra <- strult(verbo);
// se ( letra == "R" || letra == "r")
// {
//   n <- strtam(verbo) - 2;
//   letra <- strelem(verbo, n);
//   se ( letra == "A" || letra == "a" )
//   { imprima "\n1ª conjugacao"; }
//   senao
//   {
//     se ( letra == "E" || letra == "e" || letra == "o" || letra == "O")
//     { imprima "\n2ª conjugacao"; }
//     senao
//     {
//       se ( letra == "I" || letra == "i" )
//       { imprima "\n3ª conjugacao"; }
//       senao
//       { imprima "\nnao existe verbo com terminacao ur"; }
//     }
//   }
// }
// senao
// { imprima "\nnao e um verbo no infinitivo"; }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite verbo: ")
    val verbo = readLine()?.trim() ?: return

    if (verbo.endsWith('r', ignoreCase = true) && verbo.length >= 2) {
        val penultima = verbo[verbo.length - 2].lowercaseChar()
        when (penultima) {
            'a' -> println("\n1ª conjugação")
            'e', 'o' -> println("\n2ª conjugação")
            'i' -> println("\n3ª conjugação")
            else -> println("\nNão existe verbo com terminação -ur")
        }
    } else {
        println("\nNão é um verbo no infinitivo")
    }
}