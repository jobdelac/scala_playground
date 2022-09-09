import scala.io.Source
import scala.io.StdIn.readLine
import java.nio.file.{Files,Paths}

object HeadFile {
  def main(args: Array[String]): Unit = {
    println("*** Let´s read some file lines! ***")
    println("USE head SYNTAX: ")
    println("head number_of_lines /path/to/your/file")

    val commandIn = readLine()
    val commandSplit = commandIn.split(" ").toList

    if (commandSplit(0) != "head") {
      printf("ERROR FATAL: command %s is not head", commandSplit(0))
    }else{

      val filename = commandSplit(2)
      val fileExists = Files.exists(Paths.get(filename))

      if(!fileExists){

        printf("ERROR FATAL: file %s does not exists", filename)

      }else {

        val n = commandSplit(1).toInt
        val pipeSource = Source.fromFile(filename)
        for (line <- pipeSource.getLines().take(n)) {
          println(line)
        }
        pipeSource.close()
      }
    }
  }
}