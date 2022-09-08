import scala.io.StdIn.readInt

object RevLookup {
  def main(args: Array[String]): Unit = {
    println("*** Find Keys from Dictionary (Map) ***")

    val map_zodiac = Map("Dragon" -> 9, "Snake" -> 8, "Horse" -> 10, "Sheep" -> 11,
      "Monkey" -> 0, "Rooster" -> 1, "Dog" -> 2, "Pig" -> 3, "Rat" -> 4, "Ox" -> 5,
      "Tiger" -> 6, "Hare" -> 7, "Xolotl" -> 2, "Cacomistle" -> 2, "Ocelot" -> 11, "Cenzontle" -> 0)

    println("Type a number between 0 and 11 to get animal keys from Chinese-Mexa Calendar: ")
    val cal_value = readInt()

    val key_animal = reverseLookup(map_zodiac,key_animal)

    println(s"The animals from calendar which match $cal_value are: ")
    key_animal.foreach(animal)


  }
  def reverseLookup(arg: Map[String, Int], value: Int): List[String] ={

    var arg_keys = arg.filter(_._2==value).keys

    return arg_keys.toList
  }
}