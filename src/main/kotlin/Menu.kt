package org.example

class Menu(private val genSec: GeneradorSecuencias, private val consola: IEntradaSalida) {

    fun fraseIncremental(){
        val numPalabras = consola.leerNumero("Introduzca el número de palabras de la frase: ")

        if (numPalabras != null) {
            genSec.fraseIncremental(numPalabras)
        }else{
            consola.mostrar("Entrada inválida.", true)
        }
    }

    fun fraseFinal(){
        val numPalabras = consola.leerNumero("Introduzca el número de palabras de la frase: ")

        if (numPalabras != null) {
            genSec.fraseFinal(numPalabras)
        }else{
            consola.mostrar("Entrada inválida.", true)
        }
    }

}