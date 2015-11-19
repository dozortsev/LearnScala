name := "LearnScala"

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.core" % "jackson-core" % "2.6.3",
  "org.codehaus.woodstox" % "woodstox-core-asl" % "4.4.1",
  "com.fasterxml.jackson.dataformat" % "jackson-dataformat-xml" % "2.6.3",
  "org.jooq" % "jooq" % "3.7.0",
  "com.google.guava" % "guava" % "18.0",
  "mysql" % "mysql-connector-java" % "5.1.36"
)
