package dozortsev.day8

object ScalaFunc {

  def main(args: Array[String]): Unit = {
    var sum: Int = 10

    List(12, 9, 0, 12).foreach(sum += _)
  }
}
