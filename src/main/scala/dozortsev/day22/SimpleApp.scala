package dozortsev.day22

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.{ComponentScan, Configuration}

class BusinessImpl {

  def doSomeOperation(): Unit = {
    println("Start")
    Thread.sleep(2000)
    println("End")
  }
}

@Configuration
@EnableAutoConfiguration
@ComponentScan
class SpringConfiguration

object SimpleApp {

  /*@Autowired
  var impl: BusinessImpl

  def main(args: Array[String]): Unit = {
  }*/
}
