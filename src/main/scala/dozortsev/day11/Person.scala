package dozortsev.day11

case class Person(var name: String, var age: Int)

object Person {

  def apply() = new Person("Mario Gotze", 24)

  def apply(name: String) = new Person(name, 21)

  def main(args: Array[String]) {

    var mario = Person()
    assert { mario.age == 24 }

    mario.age = 21
    assert { mario.age == 21 }

    assert {
      mario.age = 100
      mario.age == 100
    }

    assert { mario.age == 100 }
  }
}
