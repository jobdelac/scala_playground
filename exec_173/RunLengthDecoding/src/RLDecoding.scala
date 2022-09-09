import scala.collection.mutable.ListBuffer

object RLDecoding {
  def main(args: Array[String]): Unit = {
    println("*** Run Length Decoding ***")

    val encodeList: ListBuffer[(String,Int)] = ListBuffer(("A",12),("B",4),("A",6),
      ("B",1), ("Z",6))
    val stringOut = decoding(encodeList,0)

    println(stringOut)
  }
  def decoding(arg: ListBuffer[(String,Int)], i: Int):String ={
    if(i < arg.length){
      return decoding(arg,i+1) + (arg(i)._1 * arg(i)._2)
    }else{
      return ""
    }
  }
}