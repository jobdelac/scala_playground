import scala.math.{sin, cos, acos, toRadians}
import scala.io.StdIn.readDouble

object distance_bet_2 extends App{

  println("*** Distancia entre dos puntos sobre la Tierra ***")
  print(" Introduce la Latitud (en grados) del primer punto: ")
  var read_1 = readDouble()
  val latP1 = toRadians(read_1)

  print(" Introduce la Longitud (en grados) del primer punto: ")
  var read_2 = readDouble()
  val lonP1 = toRadians(read_2)

  print(" Introduce la Latitud (en grados) del segundo punto: ")
  var read_3 = readDouble()
  val latP2 = toRadians(read_3)

  print(" Introduce la Longitud (en grados) del segundo punto: ")
  var read_4 = readDouble()
  val lonP2 = toRadians(read_4)

  var distance = 6371.01*acos {
    sin(latP1) * sin(latP2) +
      cos(latP1) * cos(latP2) * cos(lonP1 - lonP2)
  }

  print(f"La distancia entre P1 and P2 es de $distance%15.2f kilometros")

}