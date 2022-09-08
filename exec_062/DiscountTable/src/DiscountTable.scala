object DiscountTable {
  def main(args: Array[String]): Unit = {

    val prices: List[Double] = List(4.95, 9.95, 14.95, 19.95, 24.95)

    println("*** Tabla de descuentos ***")
    println("La tienda tiene un descuento del 60 por ciento en los siguientes precios: ")

    println("Precio --- Descuento --- Prec. con Descuento")

    for (price <- prices){

      var desc = price*0.6
      var price_desc = price*0.4

      println(f"$$$price ---  $$$desc%.1f2   ---   $$$price_desc%.1f2")
    }

  }
}