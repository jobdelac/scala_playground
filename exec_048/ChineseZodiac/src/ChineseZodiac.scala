import scala.io.StdIn.readInt

object ChineseZodiac {
  def main(args: Array[String]): Unit = {

    println("*** This program will tell you an animal from Chinese Zodiac for a given year")

    val map_zodiac = Map(8->"Dragon",9->"Snake",10->"Horse", 11->"Sheep",
      0->"Monkey",1->"Rooster", 2->"Dog", 3->"Pig",4->"Rat",5->"Ox",6->"Tiger",7->"Hare")

    print("Please, give me a year: ")
    val year_in = readInt()

    val year_out = map_zodiac(year_in % 12)

    println(s"Year $year_in is the year of the $year_out")

  }
}