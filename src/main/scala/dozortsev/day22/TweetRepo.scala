package dozortsev.day22

import org.springframework.data.repository.CrudRepository

trait TweetRepo extends CrudRepository[Tweet, Integer]
