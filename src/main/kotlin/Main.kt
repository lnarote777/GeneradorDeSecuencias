package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val consola = Consola()
    val generadorSecuencias = GeneradorSecuencias(consola)

    var numPalabras = consola.leerNumero("Introduzca el número de palabras de la frase: ")

    if (numPalabras != null) {
        generadorSecuencias.fraseIncremental(numPalabras)
    }else{
        consola.mostrar("Entrada inválida.", true)
    }

    numPalabras = consola.leerNumero("Introduzca el número de palabras de la frase: ")

    if (numPalabras != null) {
        generadorSecuencias.fraseFinal(numPalabras)
    }else{
        consola.mostrar("Entrada inválida.", true)
    }

}