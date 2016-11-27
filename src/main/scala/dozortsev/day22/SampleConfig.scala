package dozortsev.day22

import java.text.SimpleDateFormat

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.{Bean, ComponentScan, Configuration}
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories
class SampleConfig {

  @Bean
  def jacksonBuilder(): Jackson2ObjectMapperBuilder = {
    val b = new Jackson2ObjectMapperBuilder()
    b.indentOutput(true).dateFormat(new SimpleDateFormat("yyyy-MM-dd"))
    b
  }
}
