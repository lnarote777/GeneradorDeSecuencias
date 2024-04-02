package org.example

class Consola: IEntradaSalida {
    override fun mostrar(mesj: String, salto: Boolean) {
        if (salto) println(mesj) else print(mesj)
    }

    override fun leerNumero(mesj: String): Int? {
        mostrar(mesj)
        return readln().toIntOrNull()
    }
}