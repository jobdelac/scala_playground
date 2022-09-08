import scala.io.StdIn.readLine

object OperatorPrecedence {
  def main(args: Array[String]): Unit = {
    println("Precedence for operators +, -, *, / and ^")
    print("Type one of this operators to obtain its precedence number: ")

    val in_char = readLine()
    val precedence_num = precedence_rel(in_char)

    if (precedence_num != -1){
      print(s"Precedence number: $precedence_num")
    }else{
      println(s"ERROR: Operator $in_char is not valid")
    }
  }
   def precedence_rel(arg:String): Int ={

     val map_precedence = Map("+"->1, "-"->1,"*"->2,"/"->2, "^"->3)
     val prec_index = map_precedence.getOrElse(arg, -1)

     return prec_index
   }
}