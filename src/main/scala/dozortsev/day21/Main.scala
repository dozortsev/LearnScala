package dozortsev.day21

import com.fasterxml.jackson.databind.{ObjectMapper => JsonParser}
import com.fasterxml.jackson.dataformat.xml.{XmlMapper => XmlParser}

object Main {
  def main(args: Array[String]) {

    val xml = new XmlParser
    val json = new JsonParser

    val reportXml =
      """
        <report id="12">
          <name>name.xml</name>
          <createdAt>10-29-2015</createdAt>
        </report>
      """

    val jsonObj: Object = xml.readValue(reportXml, classOf[Object])

    println(json.writerWithDefaultPrettyPrinter.writeValueAsString(jsonObj))

    /*
        out put

    {
      "id" : "12",
      "name" : "name.xml",
      "createdAt" : "10-29-2015"
    }

    */
  }
}
