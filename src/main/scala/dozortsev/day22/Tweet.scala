package dozortsev.day22

import java.util.Date

import scala.beans.BeanProperty

class Tweet(@BeanProperty var author: String,
            @BeanProperty var content: String,
            @BeanProperty var created: Date)
