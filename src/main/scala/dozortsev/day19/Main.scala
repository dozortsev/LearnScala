package dozortsev.day19

import java.util.{ArrayList => JList}   // rename class in import process
import scala.Predef.{println => p}      // provide shortcut alias on a exist method

object Main {
  def main(args: Array[String]) {

    val ints = new JList[Int]()
    ints add 12
    ints add 100

    p(ints)
  }
}
