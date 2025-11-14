object TiendaDigital {
  def ajustarPrecios(
                      precios: List[Double],
                      reglaDeAjuste: Double => Double
                    ): List[Double] = {
    precios.map(reglaDeAjuste)
  }
  // Política 1: Agregar un impuesto (Ej: 16% de IVA)
  def agregarIVA(precio: Double): Double = {
    precio * 1.16
  }
  // Política 2: Aplicar un descuento (Ej: 25% de descuento)
  def descuento25(precio: Double): Double = {
    precio * 0.75
  }
  // Política 3: Estrategia comercial (Ej: "Precios de remate", todo 5.50 más)
  def preciosRemate(precio: Double): Double = {
    precio + 5.50
  }
  def main(args: Array[String]): Unit = {
    val preciosOriginales = List(100.0, 50.0, 20.0, 80.0)
    println(s"Precios Originales: $preciosOriginales")
    // Aplicamos la política de IVA pasando la función 'agregarIVA' como argumento
    val preciosConIVA = ajustarPrecios(preciosOriginales, agregarIVA)
    println(s"Precios con IVA:    $preciosConIVA")
    // Aplicamos la política de descuento pasando la función 'descuento25'
    val preciosConDescuento = ajustarPrecios(preciosOriginales, descuento25)
    println(s"Precios con 25% OFF: $preciosConDescuento")
    // Aplicamos la política de remate
    val preciosEnRemate = ajustarPrecios(preciosOriginales, preciosRemate)
    println(s"Precios de Remate:   $preciosEnRemate")
    // Política: Un descuento fijo de 10.0
    val preciosConDescuentoFijo = ajustarPrecios(preciosOriginales, precio => precio - 10.0)
    println(s"Precios con S/10 OFF: $preciosConDescuentoFijo")
  }
}