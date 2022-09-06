import scala.io.StdIn.readInt

object Main {
  def main(args: Array[String]): Unit = {

    val map_shape = Map(3->"Triangle", 4->"Square", 5->"Pentagon",
      6->"Hexagon", 7->"Heptagon", 8->"Octagon", 9->"Nonagon", 10->"Decagon")

 println("*** I'll tell you the name of the shape ***")
 print("Please, give the number of sides your shape have: ")

 val side_num = readInt()

 if (side_num > 10 || side_num < 3){
   println("Sorry, the number of sides is out the range [3,10]")
 } else{

   val shape_name = map_shape(side_num)
   println(s"The name of your shape is $shape_name")
 }
}
}