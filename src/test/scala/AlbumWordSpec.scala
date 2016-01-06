package com.oreilly.testingscala

import org.scalatest.FunSpec
import org.scalatest.ShouldMatchers

/**
  * Created by ivan on 05/01/16.
  */
class AlbumWordSpec extends FunSpec with ShouldMatchers {

  describe("An Album"){

    it("accept the title, the year and Band as parameters"){

      new Album("Hotel California", 1977,
        new Band("The Eagles",
                new Artist("Don", "Henley"),
                new Artist("Glen", "Frey"),
                new Artist("Joe", "Walsh"),
                new Artist("Randy", "Meisner"),
                new Artist("Don", "Felder")
        )
      )

    }

    it("throw an IllegalArgumentException if there are no acts when created"){
      an [IllegalArgumentException] should be thrownBy {
        new Album("Take On Me", 1980)
      }
    }


  }

}
