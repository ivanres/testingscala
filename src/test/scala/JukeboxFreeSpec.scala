package com.oreilly.testingscala

import org.scalatest._

class JukeboxFreeSpec extends FreeSpec with ShouldMatchers {

  "given 3 albums" - {

    val badmotorfinger = new Album("Badmotorfinger", 1991, None,
      new Band("Soundgarden"))
    val thaDoggFather = new Album("The Dogg Father", 1996, None,
      new Artist("Snoop Doggy", "Dogg"))
    val satchmoAtPasadena = new Album("Satchmo At Pasadena", 1951, None,
      new Artist("Louis", "Armstrong"))

    "when a jukebox is instatiated, it should accept some albums" - {
      val jukebox = new Jukebox(Some(List(badmotorfinger, thaDoggFather, satchmoAtPasadena)))

      "then a jukebox's album catalog size should be 3" in {
        jukebox.albums.get should have size (3)
      }

    }

  }

  "el constructor de Jukebox accepta None" - {
    val jukebox = new Jukebox(None)
    "y devuelve None  cuando se pide el album" in {
      jukebox.albums should be (None)
    }
  }

}
