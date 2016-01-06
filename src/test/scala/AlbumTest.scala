package com.oreilly.testingscala

import org.scalatest.FunSpec
import org.scalatest.ShouldMatchers

class AlbumTest extends FunSpec with ShouldMatchers {

	describe("An Album"){
		it("can add an Artist object to the Album"){
			val album = new Album("Thriller", 1981, new Artist("Michael", "Jackson"))
			//album.artist.firstName should be ("Michael")
      pending
		}

	}

  describe("a matcher"){
    it("can check sizes"){
      val s = 4 :: 3 :: 2 :: Nil
      s.size should be (3)
    }

    it("can check long strings"){
      val string = """I fell into a burning ring of fire.
I went down, down, down and the flames went higher"""
      string should startWith ("I fell")
      string should endWith ("higher")
      string should not endWith("derp")
      string should include ("down, down, down")
      string should not include("mudkips")
    }

  }


  describe("aNum"){
    it("can use relational operators"){
      val aNum = 42
      aNum should be < 50
      //aNum should have
    }
  }

  describe("Scalatest") {
    it("can test floats"){
      (0.9 - 0.8) should be (0.1 +- .01 )
    }
  }

  describe("Scalatest") {
    it("can test iterables"){
      List() should be ('empty)
      7::6::8::3::Nil should contain (6)

      (1 to 9) should have length 9

      an [IndexOutOfBoundsException] should be thrownBy {
        "foo".charAt(-1)
      }
    }
  }




}