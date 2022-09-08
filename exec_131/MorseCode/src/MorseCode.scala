import scala.io.StdIn.readLine

object MorseCode {
  def main(args: Array[String]): Unit = {
    val MorseDict = Map("A" -> ".- ", "B" -> "-... ", "C" -> ".-.- ", "D" -> "-..",
      "E" -> ". ", "F" -> "..-. ", "G" -> "--. ", "H" -> ".... ", "I" -> ".. ", "J" -> ".--- ",
      "K" -> "-.- ", "L" -> ".-.. ", "M" -> "-- ", "N" -> "-. ", "O" -> "--- ", "P" -> ".--. ",
      "Q" -> "--.- ", "R" -> ".-. ", "S" -> "... ", "T" -> "- ", "U" -> "..- ", "V" -> "...- ",
      "W" -> ".-- ", "X" -> "-..- ", "Y" -> "-.-- ", "Z" -> "--.. ", "1" -> ".---- ", "2" -> "..--- ",
      "3" -> "...-- ", "4" -> "....- ", "5" -> "..... ", "6" -> "-.... ", "7" -> "--... ", "8" -> "---.. ",
      "9" -> "----. ", "0" -> "----- ")

    println("*** Morse Code Translator")
    println("Please, type the message you want to translate to Morse Code: ")
    val message = readLine()

    val MorseMessage = MorseTranslate(message, MorseDict)

    println("Your message in Morse Code is: ")
    print(MorseMessage)
  }
  def MorseTranslate(arg: String, dict:Map[String,String]): String = {

    var no_spaces = arg.replaceAll("[^a-zA-Z0-9]","").toUpperCase()
    var out_str: String = ""

    for (item <- no_spaces){
      var morse_char = dict(item.toString)
      out_str = out_str + morse_char
    }
    return out_str
  }
}