fun main() {

    val set1 = setOf("manzana", "pera", "naranja", "limón", "plátano")
    val set2 = setOf("manzana", "uva", "naranja", "mango", "papaya")

    println("Set1: $set1")
    println("Set2: $set2")

    val unionSet = set1.union(set2)
    println("Unión de set1 y set2: $unionSet")

    val intersectSet = set1.intersect(set2)
    println("Intersección de set1 y set2: $intersectSet")

    val contieneManzana = set1.contains("manzana")
    println("Set1 contiene 'manzana': $contieneManzana")

    val estaContenido = set1.containsAll(setOf("manzana", "naranja"))
    println("Set1 contiene 'manzana' y 'naranja': $estaContenido")


}