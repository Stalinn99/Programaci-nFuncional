val precion:List[Double] = List (1,2,3,4,5)
def ajustarPrecios(precios: List[Double],reglaDeAjuste: Double => Double): List[Double] = {
  precios.map(reglaDeAjuste)
}
