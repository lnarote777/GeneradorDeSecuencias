package org.example

interface IEntradaSalida {
    fun mostrar(mesj: String, salto: Boolean = false)
    fun leerNumero(mesj: String): Int?
}