package dozortsev.day15

object Driver extends App {

  println(MAGIC_NUM)

  val mm = MutableMap("name" -> "all")
  mm += ("password" -> "123", "username" -> "luis")

  for ((k, v) <- mm) {
    println(s"key: '$k', value: '$v'")
  }

  var nullValue = null

  println(Objects.ifNull(nullValue, "hello"))
}

object Objects {

  def ifNull[T](obj: T, value: T) = if (obj == null) { println("condition is true"); value } else obj
}
