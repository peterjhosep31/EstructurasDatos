fun main() {

        val par1 = Pair("nombre", "Juan")

        println("Par 1: $par1")

        val clave = par1.first
        val valor = par1.second
        println("Clave: $clave, Valor: $valor")

        val par2 = Pair("edad", 30)
        val mapa = mapOf(par1, par2)
        println("Mapa: $mapa")

        val lista = listOf("Juan", 30, "Calle Falsa 123")
        val par3 = lista[0] to lista[1]
        println("Par 3: $par3")

        val (nombre, edad) = par1
        println("Nombre: $nombre, Edad: $edad")

}