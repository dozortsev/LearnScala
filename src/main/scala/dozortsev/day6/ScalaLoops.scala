package dozortsev.day6

object ScalaLoops {

  def main(args: Array[String]): Unit = {
    for (el <- 2 to 3) {
      println(
        if (el % 2 == 0)
          el / 2
        else
          throw new RuntimeException(s"$el must be even")
      )
    }
  }
}
