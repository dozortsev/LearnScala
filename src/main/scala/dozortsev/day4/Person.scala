package dozortsev.day4

object Scratch {

  def sumInts(a: Int, b: Int): Int = {
    if (a > b) 0 else a + sumInts(a + 1, b)
  }

  def cube(x: Int): Int = x * x * x

  def fact(x: Int): Int = if (x == 0) 1 else x + fact(x - 1)

  def sumCube(a: Int, b: Int): Int = {
    if (a > b) 0 else cube(a) + sumCube(a + 1, b)
  }

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)
  }


  def main(args: Array[String]): Unit = {
//    println(sumInts(12, 15))
//    println(sumCube(2, 5))
//    println(sum(cube, 2, 5))
    printf("Sum: %s", sum((v: Int) => { val result = v * v; println(result); result }, 2, 5))

//    println(fact(5))
  }
}
