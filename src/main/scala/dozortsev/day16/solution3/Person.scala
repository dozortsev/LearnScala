package dozortsev.day16.solution3

case class Person(var name: String = "undefined", var age: Int = 0) {
  override def toString: String = s"Tip; '$name', '$age'"
}

object Person {

  def apply() = new Person

  def apply(name: String) = new Person(name)
}

object Driver extends App {

  val foo = Person()
  val bar = Person("Junior")
  val baz = Person(name = "Luis", age = 75)
  val moo = Person(age = 100)

  for (tip <- List(foo, bar, baz, moo)) {
    println(tip)
  }
}
