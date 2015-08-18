import scala.util.Random

println {
  val number = Random.nextInt(1000)

  s"$number ${if (number > 100) ">" else "<"} then 100"
}