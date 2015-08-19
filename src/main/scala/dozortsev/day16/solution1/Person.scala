package dozortsev.day16.solution1

class Person(val name: String, val age: Int = 0) {

  var position: String = "undefined"

  override def toString = s"Person; name: $name, age: $age, position: $position"
}

object Person {

  def apply(name: String) = new Person(name)

  def apply(name: String, age: Int) = new Person(name, age)
}

object Driver extends App {

  val goalKeeper = Person("Manuel Neuer")
  val emploees = Array(Person("Mario Gotze", 23), Person("Marco Reus", 23), goalKeeper)

  assert(0 == goalKeeper.age)
  assert(emploees(0).age == emploees(1).age)

  emploees(0).position = "forward"

  emploees.foreach(println(_))
}
