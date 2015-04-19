package dozortsev.day7

object ScalaScratch {

  def makeRowSeq(row: Int): Seq[String] =
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }

  def makeRow(row: Int) = makeRowSeq(row).mkString

  def multiTable() = {
    val tableSeq = for (row <- 1 to 10) yield makeRow(row)

    tableSeq.mkString("\n")
  }

  def main(args: Array[String]): Unit = {
    println(multiTable())
  }
}
