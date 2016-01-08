package com.oreilly.testingscala

import org.scalatest._

class AlbumFeatureSpec extends FeatureSpec with ShouldMatchers with GivenWhenThen{

  feature("An album's default constructor should support " +
    "a parameter that accepts Option(List(Tracks))"){


    scenario("Album's default constructor is given a list of the 3 tracks" +
      " exactly for the tracks parameter"){
      val depecheModeCirca1990 = new Band("Depeche Mode",
        new Artist("Dave", "Gahan"),
        new Artist("Martin", "Gore"),
        new Artist("Andrew", "Fletcher"),
        new Artist("Alan", "Wilder"))

      val blackCelebration = new Album("Black Celebration", 1990,
        Some(List(new Track("Black Celebration"),
          new Track("Fly on the Windscreen"),
          new Track("A Question of Lust"))), depecheModeCirca1990)
      blackCelebration.tracks.get.size should be (3)

    }

    scenario("Album's default constructor is given a None for the tracks parameter"){
      Given("Some band")
      val someBand = new Band("The derp brothers",
        new Artist("Tom", "Johnston"),
        new Artist("Patrick", "Simmons"),
        new Artist("Tiran", "Porter"),
        new Artist("Keith", "Knudsen"),
        new Artist("John", "Hartman")
      )

      When("the band is instatiated with title, year, none tracks and someBand")
      val album = new Album("The album name", 1973, None, someBand)

      Then("the fields should be set")
      album.title should be ("The album name")
      album.year should be (1973)
      album.tracks should be (None)
      album.acts(0) should be (someBand)
    }

    scenario("Album's default constructor is given null for the tracks parameter"){
      pending
    }


  }



  feature("An album should have an addTrack method that takes a track and returns an" +
    " immutable copy of the Album with the added track"){

  }

}
