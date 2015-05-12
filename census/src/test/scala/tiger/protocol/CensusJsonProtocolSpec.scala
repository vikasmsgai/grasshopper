package tiger.protocol

import java.net.InetAddress
import java.util.Calendar
import org.scalatest.FlatSpec
import org.scalatest.MustMatchers
import tiger.model.{ ParsedAddressInput, Status }
import spray.json._

class CensusJsonProtocolSpec extends FlatSpec with MustMatchers with CensusJsonProtocol {

  "Status" should "convert to and from JSON" in {
    val date = Calendar.getInstance().getTime().toString
    val status = Status("OK", "grasshopper-census", date, InetAddress.getLocalHost.getHostName)
    status.toJson.convertTo[Status] mustBe status
  }

  "ParsedAddressInput" should "convert to and from JSON" in {
    val addressInput = ParsedAddressInput(1311, "30th St NW", 20007, "DC")
    addressInput.toJson.convertTo[ParsedAddressInput] mustBe addressInput
  }
}

