/*Scala doesn't have a built-in library for date-time*/
/*Lets use the Java library*/
import java.util.Calendar

object TodayDatetime {
  def main(args: Array[String]){

    var TodayDate = Calendar.getInstance()

    /*Extraemos los valores de dia, mes año*/

    val curr_Day = TodayDate.get(Calendar.DAY_OF_MONTH)
    val curr_Mon = TodayDate.get(Calendar.MONTH)
    val curr_Year = TodayDate.get(Calendar.YEAR)

    /*Extraemos los valoresde minuto y hora del dia*/

    var curr_MIN = TodayDate.get(Calendar.MINUTE)
    var curr_HOUR = TodayDate.get(Calendar.HOUR_OF_DAY)

    print(s"Son las $curr_HOUR:$curr_MIN y ")
    print(s"es el $curr_Day/$curr_Mon/$curr_Year")
  }
}