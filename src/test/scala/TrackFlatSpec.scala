package com.oreilly.testingscala

import org.scalatest._
import java.time._
class TrackFlatSpec extends FlatSpec with MustMatchers{


  behavior of "A track"

  it must
    """have a constructor that accepts
      |the name and lenth of the track in min:sec
      |and returns a java.time.Period when track.period is called
    """.stripMargin in {
    val track = new Track("Last Dance", "5:00")
    track.period must be (Duration.parse("PT5M0S"))

  }

}
