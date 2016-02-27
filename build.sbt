name := "LearnScala"

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.core" % "jackson-core" % "2.6.3",
  "org.codehaus.woodstox" % "woodstox-core-asl" % "4.4.1",
  "com.fasterxml.jackson.dataformat" % "jackson-dataformat-xml" % "2.6.3",
  "org.jooq" % "jooq" % "3.7.0",
  "com.google.guava" % "guava" % "18.0",
  "mysql" % "mysql-connector-java" % "5.1.36",
  "org.springframework.boot" % "spring-boot-starter-web" % "1.3.2.RELEASE",
  "aspectj" % "aspectjrt" % "1.5.4",
  "aspectj" % "aspectjweaver" % "1.5.4",
  "org.scalactic" %% "scalactic" % "2.2.6",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)
