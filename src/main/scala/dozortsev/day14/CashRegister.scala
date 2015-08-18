package dozortsev.day14

import java.text.SimpleDateFormat
import java.util.Calendar

object CashRegister {
  def close { println("close") }

  def open { println("open") }
}

object Main extends App {

  CashRegister.open

  CashRegister.close

  println(Dates.currentDate)
  println(Dates.currentTime)

  println(Strings.increment("Anton"))
}

object Dates {

  private def currentDateTime(dateTimeFormat: String): String = {
    new SimpleDateFormat(dateTimeFormat).format(Calendar.getInstance().getTime)
  }

  def currentDate: String = currentDateTime("EEEE, MMMM d")

  def currentTime: String = currentDateTime("K:m aa")
}

object Strings {

  def increment(str: String) = str.map(c => (c + 1).toChar)
}
