import scala.io.StdIn.{readInt,readLine}
import scala.collection.mutable.ListBuffer

object RemoveOutliers {
  def main(args: Array[String]): Unit = {

    println("*** Remove n maxima and minima from data ***")
    println("Please, insert de data values manually (type DONE when finish): ")

    var dataList = new ListBuffer[Double]()
    var flag_loop = 1

    while(flag_loop == 1){
      var data_i = readLine()
      if(data_i == "DONE"){
        flag_loop = 0
      }else{
        dataList += data_i.toDouble
      }
    }

    val complete_list = dataList.toList

    if(complete_list.length < 4){
      println("ERROR: I need more than 4 data values")
    }else{
      println("How many Outliers have to be removed? Type the number: ")
      val outlier_num = readInt()
      val clean_dataList = remove_max_min(dataList, outlier_num)
      println("Data without outliers:")
      println(clean_dataList)
      println("--------------------------------------")
      println("Original Data: ")
      print(complete_list)
    }
  }

  def remove_max_min(arg: ListBuffer[Double], out_num: Int): ListBuffer[Double] = {
    val i = 0
    for ( i <- 1 to out_num){
      var dataMax = arg.max
      var dataMin = arg.min
      arg -= dataMax /* Un valor a la vez*/
      arg -= dataMin
    }
    return arg
  }
}