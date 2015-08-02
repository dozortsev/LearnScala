package dozortsev.day9

class Person(var _firstName: String, var _lastName: String) {
  println("Main constructor")
  
  def fName = _firstName
  def fName_=(aFirstName: String) = this._firstName = aFirstName

  def lName = _lastName
  def lName_=(aLastName: String) = this._lastName = aLastName

  var _age: Int = 0

  def this (firstName: String, lastName: String, age: Int) = {
    this(firstName, lastName)
    this._age = age
    println("Auxiliary constructor")
  }

  override def toString = "%s, %s is %d year%s old".format(fName, lName, _age, if (_age == 1) "" else "s")
}

class Pizza(var crustSize: Int, var crustType: String) {

  def this(crustSize: Int) {
    this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
  }

  def this(crustType: String) {
    this(Pizza.DEFAULT_CRUST_SIZE, crustType)
  }
}

object Pizza {
  val DEFAULT_CRUST_SIZE = 12
  val DEFAULT_CRUST_TYPE = "thin"
}

class Socket(val timeout: Int = 1000, val linger: Int = 2000, val domain: String) {

  override def toString = s"domain: $domain timeout: $timeout, linger: $linger"
}

object TestStation {

  val sum: (Int, Int) => Int = _ + _

  def main(args: Array[String]) {
    val diego = new Person("Diego", "Forlan", 2)
    println(diego)

    diego.fName = "Carlos"
    println(diego.fName)

    val socket = new Socket(domain = "local", timeout = 900)
    assert { socket.linger == 2000 }
    assert { socket.timeout == 900 }
  }
}
