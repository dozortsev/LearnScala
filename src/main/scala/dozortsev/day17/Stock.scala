package dozortsev.day17

class Stock {

  // this field visible for any Stock instances
  // as this member is modified as private getter and setter methods won't be generated
  private var price: Double = _

  def setPrice(price: Double) = this.price = price

  def isHigher(that: Stock) = this.price > that.price
}

object Driver extends App {

  val foo = new Stock
  val bar = new Stock

  foo.setPrice(12.6)
  bar.setPrice(17.12)

  assert(bar isHigher foo)
}
