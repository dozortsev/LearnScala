package dozortsev.day2

object Timer {

  def oncePerSecond(callback: () => Unit) {
    while (true) {
      callback()
      Thread sleep 2000
    }
  }

  def timeFlies() = println("time flies like arrow...")

  def main(args: Array[String]): Unit = {
    val c = new Complex(1.2, 2.3)
    println(c.real)
    println(c.im)

    println(c)
  }
}
