// Código original
// Enunciado:
// Ler três números e imprimir se eles podem ou não ser lados de um triângulo.
//
// prog se33
// real a, b, c;
// imprima "\ndigite 1 lado: ";
// leia a;
// imprima "\ndigite 2 lado: ";
// leia b;
// imprima "\ndigite 3 lado: ";
// leia c;
// se ( a < b + c && b < a + c && c < a + b )
// { imprima "\nPodem ser lados de um triangulo"; }
// senao
// { imprima "\nNâo podem ser lados de um triangulo"; }
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

    // Condição de existência de um triângulo: a soma de dois lados deve ser sempre maior que o terceiro
    if (a < b + c && b < a + c && c < a + b) {
        println("Podem ser lados de um triangulo")
    } else {
        println("Não podem ser lados de um triangulo")
    }
}