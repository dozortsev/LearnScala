package day1.day1_1

class Complex(val r: Double, val i: Double) extends Ordered[Complex] {
  def real = r
  def image = i
  def magnitude = Math.sqrt((r * r) + (i * i))
  def angle = Math.atan2(i, r)

  def +(that: Complex) = new Complex(
    this.real + that.real, this.image + that.image
  )

  override def toString: String = real + " + i * " + image + " | " +
    magnitude + " e^(i * " + angle + ")"

  def compare(that: Complex): Int = this.magnitude compare that.magnitude

}
