package dozortsev.day1

import java.nio.file.{Paths, Files}

object FilePrinter {

  val ScalaSource = "*.scala"
  val Path = "/home/ant/Documents/Java_Projects/LearnScala/src/main/scala/dozortsev/day1"

  def main(args: Array[String]) {
    val stream = Files.newDirectoryStream(Paths.get(Path), ScalaSource)
    val paths = stream.iterator

    while (paths.hasNext) {
      println(paths.next.getFileName)
    }
  }
}
