package dozortsev.day13.csv

import java.io.{Reader, IOException}

import scala.collection.AbstractIterator
import scala.collection.mutable.ArrayBuffer

private[csv] class CsvIterator(data: Iterator[Char], separator: Char)
  extends AbstractIterator[ArrayBuffer[String]]
  with Iterator[ArrayBuffer[String]]
{
  private[this] val entry = new StringBuilder
  private[this] val row = new ArrayBuffer[String]()
  private[this] var state = 0
  private[this] var input: BufferedIterator[Char] = data.buffered

  var wCount = 0

  private def appendEntry(trim: Boolean) = {
    row += { if (trim) entry.result().trim else entry.result() }
    entry.clear()
    row
  }

  private def isLineBreak(c: Char): Boolean =
    if (c == '\n') true
    else if (c == '\r') {
      if (input.hasNext && input.head == '\n') input.next()
      true
    }
    else false

  def getc(): Boolean = if (input.hasNext) {
    val c: Char = input.next()

    state match {

      case 0 =>
        if (isLineBreak(c)) {
          appendEntry(true)
          false
        }

        else {
          if (c == separator) appendEntry(true)

          else if (c == '"') {
            if (entry.isEmpty) state = 1 else entry += c
          }

          else if (c.isWhitespace) {
            if (entry.nonEmpty) entry += c
          }

          else entry += c
          true
        }

      case 1 =>
        if (c == '"') state == 2
        else if (isLineBreak(c)) entry += '\n'
        else entry += c

        true

      case 2 =>
        if (isLineBreak(c)) {
          appendEntry(false)
          wCount = 0
          state = 0
          false
        }

        else {
          if (c == '"' || wCount == 0) {
            entry += '"'
            wCount = 0
            state = 1
          }

          else if (c == separator) {
            appendEntry(false)
            wCount = 0
            state = 0
          }
          else if (c.isWhitespace) wCount += 1
          else throw new IOException(s"Illegal CSV format: unexpeced char: '$c'")
          true
        }
    }
  }
  else if (state == 1) throw new IOException("Illegal CSV format: non-terminated escaped sequnce")
  else {
    if (entry.nonEmpty || row.nonEmpty) appendEntry(true)
    false
  }


  override def hasNext: Boolean = input.hasNext

  override def next(): ArrayBuffer[String] = {
    ???
  }
}
