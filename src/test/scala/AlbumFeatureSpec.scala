package com.oreilly.testingscala

import org.scalatest._

class AlbumFeatureSpec extends FeatureSpec with ShouldMatchers{

  feature("An album's default constructor should support " +
    "a parameter that accepts Option(List(Tracks))"){


    scenario("Album's default constructor is given a list of the 3 tracks" +
      "exactly for the tracks parameter"){
      pending
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
