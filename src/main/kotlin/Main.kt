package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val consola = Consola()
    val generadorSecuencias = GeneradorSecuencias(consola)
    val menu = Menu(generadorSecuencias, consola)

    menu.fraseIncremental()
    menu.fraseFinal()


}