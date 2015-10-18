name := "LearnScala"

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.13",
  "org.jooq" % "jooq" % "3.7.0",
  "com.google.guava" % "guava" % "18.0",
  "mysql" % "mysql-connector-java" % "5.1.36"
)
