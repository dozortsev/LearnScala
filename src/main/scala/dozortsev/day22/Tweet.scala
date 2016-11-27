package dozortsev.day22

import java.util.Date
import javax.persistence.{Column, GeneratedValue, Id, Entity}

import scala.beans.BeanProperty

@Entity
class Tweet {

  @Id @GeneratedValue @BeanProperty var id: Integer = _
  @BeanProperty var author: String = _
  @BeanProperty var content: String = _
  @BeanProperty var created: Date = _
}
