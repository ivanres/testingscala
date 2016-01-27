
import org.scalatest._

class ElasticsearchSpec extends FreeSpec with ShouldMatchers {

  "doing a request"  ignore {
    val res = scala.io.Source.fromURL("http://127.0.0.1:9200", "utf-8")
      .getLines().mkString("\n")

    println(res)
    pending
  }

}
