package dozortsev.day14

class Pizza(var crustType: String) {

  override def toString = s"Pizza; crust type is $crustType"
}

object Pizza {

  val CRUST_TYPE_THIN = "thin"
  val CRUST_TYPE_THICK = "thick"

  def apply(crustType: String): Pizza = {
    new Pizza(crustType)
  }
}
