package dozortsev.day20

trait PizzaTrait {
  var numToppings: Int
  var size = 14
  val maxNomToppings = 10
}

class Pizza extends PizzaTrait {
  var numToppings: Int = 100
  size = 12
}

object Driver {
  def main(args: Array[String]) {

    val pizza = new Pizza

    assert(pizza.size == 12)
    assert(pizza.numToppings == 100)
  }
}
