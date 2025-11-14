//funccion anonima
val generadorIncrementadorAnonimo: Int => (Int => Int) =
  (incremento: Int) =>
    (x: Int) =>
      x + incremento

//funcion con nombre

def funcion3(x : Int): Int = x
