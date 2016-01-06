package com.oreilly.testingscala

import org.scalatest._

class AlbumFeatureSpec extends FeatureSpec with ShouldMatchers{

  feature("An album's default constructor should support " +
    "a parameter that accepts Option(List(Tracks))"){


    scenario("Album's default constructor is given a list of the 3 tracks" +
      "exactly for the tracks parameter"){
      val depecheModeCirca1990 = new Band("Depeche Mode",
        new Artist("Dave", "Gahan"),
        new Artist("Martin", "Gore"),
        new Artist("Andrew", "Fletcher"),
        new Artist("Alan", "Wilder"))

      val blackCelebration = new Album("Black Celebration", 1990,
        Some(List(new Track("Black Celebration"),
          new Track("Fly on the Windscreen"),
          new Track("A Question of Lust"))), depecheModeCirca1990)
      blackCelebration.tracks should have size(3)

    }

    scenario("Album's default constructor is given an empty List for the tracks parameter"){
      pending
    }

    scenario("Album's default constructor is given null for the tracks parameter"){
      pending
    }


  }



  feature("An album should have an addTrack method that takes a track and returns an" +
    " immutable copy of the Album with the added track"){

  }

}
