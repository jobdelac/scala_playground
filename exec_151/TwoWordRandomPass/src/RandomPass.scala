import scala.io.Source
import scala.util.Random
import scala.collection.mutable.ListBuffer

object RandomPass {
  def main(args: Array[String]): Unit = {
    println("*** Two Word Pass Generator ***")

    val fileName = "C:\\Users\\CONSULTOR\\Documents\\scala_playground\\exec_151\\common_words.txt"
    val pipeSource = Source.fromFile(fileName)
    var wordList = new ListBuffer[String]()

    for(line <- pipeSource.getLines()){
      var word_item = line.replaceAll("[^a-zA-Z]","").capitalize
      wordList += word_item
    }

    pipeSource.close()

    val passFin = passGenerator(wordList)

    println(s"Your Two Word Pass is: $passFin")
  }
  def passGenerator(arg:ListBuffer[String]): String = {
    var littleFlag = true
    var passOut: String = ""

    while (littleFlag) {
      var passWord: String = ""
      val wordOne = arg(Random.nextInt(arg.size))
      val wordTwo = arg(Random.nextInt(arg.size))

      if (wordOne.length >= 3) {
        if(wordTwo.length >= 3){
          passWord = wordOne + wordTwo
          if (passWord.length >= 8) {
            if (passWord.length <= 10){
              littleFlag = false
              passOut = passWord
            }
          }
        }
      }
    }
    return passOut
  }
}