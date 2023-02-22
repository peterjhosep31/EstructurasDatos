fun main(){
        val numeros = arrayOf(1, 2, 3, 4, 5)
        println("El primer número es ${numeros[0]}")

        numeros[1] = 10
        println("El segundo número es ${numeros[1]}")

        for (numero in numeros) {
            println(numero)
        }
        for (i in numeros.indices) {
            println("El número en la posición $i es ${numeros[i]}")
        }
        numeros.sort()
        println("El arreglo ordenado es ${numeros.joinToString()}")

        val numerosPares = numeros.filter { it % 2 == 0 }
        println("Los números pares son ${numerosPares.joinToString()}")
}
