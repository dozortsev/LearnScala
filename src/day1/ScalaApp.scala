package day1

object ScalaApp {
  def main(args: Array[String]) {

    (1 to 10).filter(_ % 2 == 0).foreach(println)

    println(1 to (10, 2) sum)
  }
}
