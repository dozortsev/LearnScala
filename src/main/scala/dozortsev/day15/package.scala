package dozortsev

import scala.collection.mutable

/**
 * Package object are great place to put methods and functions that are common to the package,
 * as well constants, enumerations and implicit conversions
 */
package object day15 {

  val MAGIC_NUM = 43

  // scala enum example
  object Margin extends Enumeration {
    type Margin = Value

    val WEST, EAST, NORTH, SOUTH = Value
  }

  type MutableMap[K, V] = mutable.Map[K, V]

  val MutableMap = mutable.Map
}
