/* Programa para imprimir una tabla de multiplicación*/

object MultiTable {
  def main(args: Array[String]): Unit = {

    val integers : List[Int] = List(1,2,3,4,5,6,7,8,9,10)

    print("   ")
    for (integer <- integers){
      print(s"$integer  ")
    }
    print("\n")

    for (i <- integers){
      printf("%d  ", i)
      for (j <- integers){
        printf("%d  ", i*j)
      }
      print("\n")
    }
  }
}