package com.oreilly.testingscala

import org.specs2.mutable.Specification


class JukeboxUnitSpec extends Specification {

  "A jukebox should" >> {
    """have a play method that returns a copy of the jukebox that selects
      |the first song on the first album as the current track"""" >> {
        //val groupTherapy = new Album("Group Therapy", 2011, new Artist("Michael", "Jackson") )

        //groupTherapy.artist.firstName must be_==("Michael")
        pending
    }
  }


}
