import scala.util.Random
import scala.collection.mutable.ListBuffer

object RandomNumbersLotto {
  def main(args: Array[String]): Unit = {

    println("*** Random Numbers Lottery Generator ***")
    var number_set = new ListBuffer[Int]()
    val len_number = 6
    var i = 0

    while(i < len_number){
      var rand_int = Random.between(1,49)
      if(!number_set.contains(rand_int)){
        number_set += rand_int
        i += 1
      }
    }

    val sorted_set = number_set.sorted
    /*val sorted_set = number_set.sortWith(_<_)*/
    println("Your lottery numbers are:")
    for (item <- sorted_set) print(s"$item ")

    /*println(s"$sorted_set")*/
  }
}