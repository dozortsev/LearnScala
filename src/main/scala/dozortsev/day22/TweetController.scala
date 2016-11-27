package dozortsev.day22

import java.lang.Iterable

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.RequestMethod.GET
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
@RequestMapping(name = "/tweets")
class TweetController @Autowired() (private val repo: TweetRepo) {

  @RequestMapping(value = Array("tweets/all"), method = Array(GET), produces = Array(APPLICATION_JSON_VALUE))
  def list(): Iterable[Tweet] = {
    repo.findAll()
  }
}
