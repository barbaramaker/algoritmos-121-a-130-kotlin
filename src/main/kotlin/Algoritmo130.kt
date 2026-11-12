// Código original
// Enunciado:
// Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra
// for menor que R$ 20,00; caso contrário, o lucro será de 30%. Entrar com o valor do produto e
// imprimir o valor da venda.
//
// prog se41
// real valor;
// imprima "\ndigite valor do produto: ";
// leia valor;
// se( valor < 20. )
// { imprima "\nValor de venda: " valor * 1.45 ; }
// senao
// { imprima "\nValor de venda: " valor * 1.3; }
// imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("Digite valor do produto: ")
    val valor = readLine()?.toDoubleOrNull() ?: return

    val valorVenda = if (valor < 20.0) {
        valor * 1.45
    } else {
        valor * 1.30
    }

    println("\nValor de venda: ${"%.2f".format(valorVenda)}")
}