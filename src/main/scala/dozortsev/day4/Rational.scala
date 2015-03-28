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

  def +(that: Rational) = new Rational(
    numer * that.denom + that.numer * denom, denom * that.denom
  )

  def +(that: Int) = new Rational(numer + that * denom, denom)

  def *(that: Rational) = new Rational(numer * that.numer, denom * that.denom)

  def *(that: Int) = new Rational(numer * that, denom)

  def -(that: Rational) = new Rational(
    numer * that.denom - that.numer * denom, denom * that.denom
  )

  def -(that: Int) = new Rational(numer - that * denom, denom)

  def /(that: Rational) = new Rational(numer * that.denom, denom * that.numer)

  def /(that: Int) = new Rational(numer, denom * that)

  def lessThan(that: Rational) = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) = if (this lessThan that) that else this

  override def toString = numer + "/" + denom

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

object Station {

  implicit def intToRational(that: Int): Rational = new Rational(that)

  def main(args: Array[String]) {
    
    println("Multiplication")
    println(new Rational(25, 5) * new Rational(35, 10))
    println(new Rational(1, 2) * 3)

    println("\nAddition")
    println(new Rational(15, 2) + new Rational(11, 7))
    println(new Rational(1, 2) + 3)

    println("\nSubtraction")
    println(new Rational(2, 3) - new Rational(1, 2))
    println(new Rational(2, 3) - 2)

    println("\nDivision")
    println(new Rational(1, 3) / new Rational(1, 5))
    println(new Rational(1, 3) / 5)

    println("\nMax value")
    println(new Rational(1, 2) max new Rational(1, 5))
    
    println("\nSwap operations possible with implicit conversation")
    println(2 * new Rational(1, 2))
    println(2 + new Rational(1, 2))
    println(2 - new Rational(1, 2))
    println(2 / new Rational(1, 2) + 2)
  }
}