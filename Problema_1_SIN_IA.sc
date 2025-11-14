def myMethod(datos:List [Double]): Double = {
  val logs: Double = datos.map(Math.log).sum
  val promediolog2: Double = (datos.map((Math.log)).sum) / datos.size
  val diferencia: List[Double] = (datos.map(Math.log) - promediolog2
}
