package day2

object App {
  def total (list: List[Int]) = {
    var sum = 0
    for (el <- list) {
      sum += el
    }

    sum
  }

  def main(args: Array[String]) {
    println(total(List(1, 2, 3)))
  }
}
