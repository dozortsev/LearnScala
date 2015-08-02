package dozortsev.day11

import java.util


class Book(private var _name: String, private var _lang: String, private var _pages: Int) {

  def name = { println("Book.name accessor"); _name }
  def name_(nameVal: String)= { println("Book.name mutator"); _name = nameVal }

  def lang = { println("Book.lang accessor"); _lang }
  def lang_(langVal: String) = { println("Book.lang mutator"); _lang = langVal }
}

object Book {
  def main(args: Array[String]) {

    val niceBook = new Book("Nice book", "English", 341)
    assert("Nice book" == niceBook.name)
  }

  var foo = {
    println("start to initialise 'foo' variable")
    12
//    println("end to initialise 'foo' variable")
  }

  println(foo.getClass)
}
