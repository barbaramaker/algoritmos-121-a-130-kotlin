// Código original
// Enunciado:
// Entrar com nome, nota da PR1 e nota da PR2 de um aluno. Imprimir nome, nota da PR1, nota da PR2, média e uma das mensagens: Aprovado, Reprovado ou em Prova Final (a média é 7 para aprovação, menor que 3 para reprovação e as demais em prova final).
//
// prog se38
// real nota1, nota2, media;
// string nome;
// imprima "\nDigite nome: ";
// leia nome;
// imprima "\nDigite 1ª nota: ";
// leia nota1;
// imprima "\nDigite 2ª nota: ";
// leia nota2;
// media <- (nota1 + nota2) / 2;
// se (media >= 7.) { imprima nome, " ", media, " AP"; }
// senao {
//   se (media < 3.) { imprima nome, " ", media, " RP"; }
//   senao { imprima nome, " ", media, " PF"; }
// }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite nome: ")
    val nome = readLine() ?: return

    print("Digite 1ª nota: ")
    val nota1 = readLine()?.toDoubleOrNull() ?: return

    print("Digite 2ª nota: ")
    val nota2 = readLine()?.toDoubleOrNull() ?: return

    val media = (nota1 + nota2) / 2

    println("\nNome: $nome")
    println("PR1: $nota1")
    println("PR2: $nota2")
    println("Média: $media")

    if (media >= 7.0) {
        println("Situação: Aprovado (AP)")
    } else if (media < 3.0) {
        println("Situação: Reprovado (RP)")
    } else {
        println("Situação: Prova Final (PF)")
    }
}