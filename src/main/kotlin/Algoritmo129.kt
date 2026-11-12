// Código original
// Enunciado:
// Entrar com o salário de uma pessoa e imprimir o desconto do INSS segundo a tabela:
// menor ou igual a R$ 600,00                      | isento
// maior que R$ 600,00 e menor ou igual a 1200,00  | 20%
// maior que R$ 1200,00 e menor ou igual a 2000,00 | 25%
// maior que R$ 2000,00                            | 30%
//
// prog se40
// real salario, desconto;
// imprima "\ndigite salario: ";
// leia salario;
// se ( salario <= 600. )
// { desconto <- 0.; }
// senao
// { se ( salario <= 1200. )
//   { desconto <- salario * 0.2; }
//   senao
//   { se ( salario <= 2000. )
//     { desconto <- salario * 0.25; }
//     senao
//     { desconto <- salario * 0.30; }
//   }
// }
// imprima "\ndesconto: ", desconto;
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite salário: ")
    val salario = readLine()?.toDoubleOrNull() ?: return

    val desconto = when {
        salario <= 600.0 -> 0.0
        salario <= 1200.0 -> salario * 0.20
        salario <= 2000.0 -> salario * 0.25
        else -> salario * 0.30
    }

    println("\nDesconto: ${"%.2f".format(desconto)}")
}