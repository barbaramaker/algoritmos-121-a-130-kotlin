// Código original
// Enunciado:
// Entrar com a idade de uma pessoa e informar:
// • se é maior de idade
// • se é menor de idade
// • se é maior de 65 anos
//
// prog se36
// int idade;
// imprima "\ndigite sua idade: ";
// leia idade;
// se( idade >= 65 )
// { imprima "\nMaior de 65"; }
// senao
// { se ( idade >= 18 )
//   { imprima "\nMaior de idade"; }
//   senao
//   { imprima "\nMenor de idade"; }
// }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite sua idade: ")
    val idade = readLine()?.toIntOrNull() ?: return

    if (idade >= 65) {
        println("Maior de 65")
    } else if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }
}