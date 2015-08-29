package dozortsev.day19

import java.util.{ArrayList => JList}   // rename class in import process

object Main {
  def main(args: Array[String]) {

    import scala.Predef.{println => p}  // put import statement anywhere

    val ints = new JList[Int]()
    ints add 12
    ints add 100

    p(ints)
  }
}
