/*Let's calculate the deposit value from number of bottles recycled!*/
import scala.io.StdIn.readLine

object Main extends App{

  println("*** Deposit Calculator ***")

  print("Introduce the number of drink containers recycled (1L or less): ")
  var read_1 = readLine()
  val one_lit_less = read_1.toFloat

  print("Introduce the number of drink containers recycled (1L or more): ")
  var read_2 = readLine()
  val one_lit_more = read_2.toFloat

  var estimate = one_lit_less*0.1 + one_lit_more*0.25

  println(f"Your total deposit is $$$estimate%.1f2")
}