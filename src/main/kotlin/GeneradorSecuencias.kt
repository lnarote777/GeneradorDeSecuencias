package org.example

class GeneradorSecuencias(val consola: IEntradaSalida) {
    private lateinit var sec: Sequence<String>

    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readLine() }.constrainOnce().take(limit)

    fun fraseIncremental(numPalabras: Int){
        sec = lineSequence(numPalabras)
        var frase = ""

        for (palabra in sec){
            frase += if (frase.isEmpty()) palabra else " $palabra"
            consola.mostrar(frase, true)
        }
    }

    fun fraseFinal(numPalabras: Int){
        sec = lineSequence(numPalabras)
        mostrarSec()
    }

    fun getSec() = sec.toList().joinToString(" ")

    fun mostrarSec(){
        consola.mostrar(getSec())
    }

}