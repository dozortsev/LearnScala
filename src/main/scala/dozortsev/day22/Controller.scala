package dozortsev.day22

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
@RequestMapping(name = "/tweet")
class Controller(@Autowired val repo: TweetRepo) {

}
