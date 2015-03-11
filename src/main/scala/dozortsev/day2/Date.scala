package dozortsev.day2

abstract class Date(y: Int, m: Int, d: Int) extends Ord {
  def year = y
  def month = m
  def day = d

  override def toString() = s"$year-$month-$day"

  override def equals(o: Any) = this.isInstanceOf[Date] && {
    val o = this.asInstanceOf[Date]

    o.day == day && o.month == month && o.year == year
  }
}
