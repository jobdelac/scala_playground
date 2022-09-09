import scala.io.StdIn.readInt

object DecimalToBinary {
  def main(args: Array[String]): Unit = {

    println("*** Decimal to Binary converter ***")
    print("Type the integer you want to convert to binary: ")

    val integerIn = readInt()

    if(integerIn < 0){
      println(s"ERROR FATAL: $integerIn is not positive")
    }else{
      val binaryOut = binaryConverter(integerIn)
      println(s"The decimal $integerIn has the binary form: $binaryOut")
    }
  }
  def binaryConverter(arg: Int): String = {
    var inner_var = arg
    if(inner_var > 0){
      return binaryConverter(inner_var/2) + (inner_var%2).toString
    }else
      return ""
  }
}
