/**
 * Alternativa idiomática (Currying).
 * Firma: (incremento: Int)(x: Int): Int
 * El compilador lo trata como una función que toma Int y devuelve (Int => Int)
 */
def generadorIncrementadorCurried(incremento: Int)(x: Int): Int = {
  x + incremento
}