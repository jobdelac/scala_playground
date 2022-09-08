import scala.io.StdIn.readInt

object WavelenghtsVisible {
  def main(args: Array[String]): Unit = {
    println("*** Identificador de colores dentro del espectro EM-Visible ***")
    println("Para saber el color correspondiente, introduce la longitud de onda: ")

    val wavlen = readInt()
    var color: String = ""

    if (wavlen > 380){
      if(wavlen <= 450){
         color = "Violeta"
      } else{
        if(wavlen <= 495){
           color = "Azul"
        } else{
          if (wavlen <= 570){
             color = "Verde"
          } else{
            if (wavlen <= 590){
               color = "Amarillo"
            } else{
              if (wavlen <= 620){
                 color = "Naranja"
              } else{
                if (wavlen <= 750){
                   color = "Rojo"
                } else{
                  println("La longitud de onda que introdujiste no está dentro del visible ~(380nm,750nm)")
                }
              }
            }
          }
        }
      }
    } else{
      println("La longitud de onda que introdujiste no está dentro del visible ~(380nm,750nm)")
    }

    if(color != ""){
      print(s"El color asociado a la longitud de onda $wavlen es el $color")
    }else{
      println(s"No hay colores asociados a la longitud $wavlen")
    }
  }
}