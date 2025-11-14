//funccion anonima
val generadorIncrementadorAnonimo: Int => (Int => Int) =
  (incremento: Int) =>
    (x: Int) =>
      x + incremento

//funcion con nombre

def generadorIncrementadorConNombre(incrementar: Int): (Int => Int) = {
  (x: Int) => x + incrementar
}
