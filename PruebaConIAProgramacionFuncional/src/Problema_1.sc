def myMethod(datos: List[Double]): Double = {
  val logs: List[Double] = datos.map(Math.log)
  val n = logs.size
  if (n == 0) {
    return 0.0
  }
  val sumaLogs: Double = logs.sum
  val promedioLog: Double = sumaLogs / n
  val sumaCuadrados: Double = logs.map { logVal =>
    val diferencia = logVal - promedioLog
    diferencia * diferencia
  }.sum
  Math.sqrt(sumaCuadrados / n)
}