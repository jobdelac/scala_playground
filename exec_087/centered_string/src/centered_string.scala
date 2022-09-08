object centered_string {
  def main(args: Array[String]): Unit = {
    val frase = "Esta es la cadena que queremos centrar"
    val len_IEEE = 80  /*80 CPL para java y terminal de Linux*/

    val frase_centrada = centering_string(frase,len_IEEE)

    print(frase_centrada)
  }

  def centering_string(arg: String, len_row: Int): String = {
    val len_arg = arg.length()
    val blank_spa = (len_row - len_arg) / 2

    val centered_str = " "*blank_spa + arg + " "*blank_spa

    return centered_str
  }
}