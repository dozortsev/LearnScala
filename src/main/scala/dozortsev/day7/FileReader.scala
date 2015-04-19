package dozortsev.day7

object FileReader {

  private def processLine(line: String, width: Int) = {
    if (line.length > width) println(line.trim)
  }

  def processFile(fileName: String, width: Int): Unit = {
    import scala.io.Source

    val file = Source.fromFile(fileName)
    for (line <- file.getLines()) {
      processLine(line: String, width: Int)
    }
  }

  def superMap(x: Int) = s"${x - 100} element"

  def main(args: Array[String]) {
    List(1, 12, 100, -9).filter(_ > 100).map(superMap).foreach(println)
  }
}
