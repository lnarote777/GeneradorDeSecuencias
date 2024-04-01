package org.example

class GeneradorSecuencias() {
    lateinit var sec: Sequence<String>

    fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readLine() }.constrainOnce().take(limit)
    fun fraseIncremental(){}
    fun fraseFinal(){}
    fun getSec(){}
    fun mostrarSec(){}

}