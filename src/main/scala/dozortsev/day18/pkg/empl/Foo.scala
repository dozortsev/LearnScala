package dozortsev.day18.pkg.empl

import dozortsev.day18.pkg.empl.baz.Bar

package foo {

  class Bar {
    override def toString: String = classOf[Bar].getName
  }
}

package baz {

  class Bar {
    override def toString: String = classOf[Bar].getName
  }

  package moo {

    class Bar {
      override def toString: String = classOf[Bar].getName
    }
  }
}

object Driver extends App {

  println(new foo.Bar)
  println(new baz.moo.Bar)
  println(new Bar)

}
