package dozortsev.day4

class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  def this(n: Int, msg: String) = {
    this(n)
    println(s"Scala is $msg")
  }

  def +(that: Rational) = new Rational(n * that.denom + that.numer * d, d * that.denom)

  def lessThan(that: Rational) = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) = if (this lessThan that) that else this

  override def toString = numer + "/" + denom

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

object Station {
  def main(args: Array[String]) {
    println(new Rational(15, 2) + new Rational(11, 7))

    println(new Rational(1, 2) max new Rational(1, 5))

    println(new Rational(0, "awesome"))
    println(new Rational(66, 42))
  }
}