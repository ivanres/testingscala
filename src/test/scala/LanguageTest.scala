//package com.oreilly.testingscala

import org.scalatest._

class LanguageTest extends FreeSpec with ShouldMatchers {

  "for loop test" in {

    for {
      x <- Seq(1, 2, 2.7, "one", "two", 'derp)
    } println(x)

  }
}
