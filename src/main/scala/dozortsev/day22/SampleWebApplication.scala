package dozortsev.day22

import org.springframework.boot.SpringApplication

object SampleWebApplication extends App {

  SpringApplication.run(classOf[SampleConfig])

  println("Works")
}
