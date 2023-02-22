fun main() {

    val productos = listOf(
        mapOf("nombre" to "Camisa", "precio" to 25.0, "descuento" to 0.1),
        mapOf("nombre" to "Pantalón", "precio" to 40.0, "descuento" to 0.2),
        mapOf("nombre" to "Chaqueta", "precio" to 80.0, "descuento" to 0.3),
        mapOf("nombre" to "Zapatos", "precio" to 60.0, "descuento" to 0.15)
    )

    println("Lista completa de productos:")
    for (producto in productos) {
        println("Nombre: ${producto["nombre"]}, Precio: ${producto["precio"]}")
    }

    val productosConDescuento = productos.filter { it["descuento"] as Double > 0.2 }
    println("Productos con descuento mayor a 0.2:")
    for (producto in productosConDescuento) {
        println("Nombre: ${producto["nombre"]}, Precio: ${producto["precio"]}, Descuento: ${producto["descuento"]}")
    }

    val precioTotalConDescuento = productosConDescuento.sumByDouble { it["precio"] as Double * (1 - it["descuento"] as Double) }
    println("Precio total de productos con descuento mayor a 0.2: $precioTotalConDescuento")

    val productosOrdenados = productos.sortedByDescending { it["precio"] as Double }
    println("Productos ordenados por precio de mayor a menor:")
    for (producto in productosOrdenados) {
        println("Nombre: ${producto["nombre"]}, Precio: ${producto["precio"]}")
    }

    val nombresProductosCaros = productos.filter { it["precio"] as Double > 50 }.map { it["nombre"] as String }
    println("Nombres de productos con precio mayor a 50: $nombresProductosCaros")

    val promedioPrecio = productos.map { it["precio"] as Double }.average()
    println("Promedio de precios de los productos: $promedioPrecio")


}