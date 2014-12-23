package day1.day1_1

object Main {
  def main(args: Array[String]): Unit = {
    val first = new Complex(1, 5)
    val second = new Complex(2, 4)

    println(first)
    println(second)

    val sum: Complex = first + second

    println(sum)
  }
}
