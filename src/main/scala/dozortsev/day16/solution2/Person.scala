package dozortsev.day16.solution2

case class Person(var name: String, var age: Int)

/**
 * Test to creating new instance of {@link Person} class without {@code new} keyword.
 * For case class will created companion object that create {@link Person#apply} function.
 */
object Main extends App {

  // example using of syntax sugar
  val person1 = Person("Diego", 12)

  val person2 = Person.apply("Diego", 12)

  // in Scala `==` operation is the same as in Java equal method
  assert(person1 == person2)
}