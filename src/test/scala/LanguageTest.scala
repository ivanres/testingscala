//package com.oreilly.testingscala

import org.scalatest._

class LanguageTest extends FreeSpec with ShouldMatchers {

  "for loop test" in {

    for {
      x <- Seq(1, 2, 2.7, "one", "two", 'derp)
    } {
      val str = x match {
        case 1 => "Number 1"
        case _:Int => "An integer " + x
        case _:Double => "A double " + x
        case _:String => "A string: " + x
        case _ => "Unexpected value: " + x
      }
      //println( str )
    }

    pending

  }


  "Sequence test" in {

    val nonEmptySeq = Seq(1, 2, 3, 4, 5)
    val emptySeq = Seq.empty[Int]
    val nonEmptyList = List(1, 2, 3, 4, 5)
    val emptyList = Nil
    val nonEmptyVector = Vector(1, 2, 3, 4, 5)
    val emptyVector =    Vector.empty[Int]
    val nonEmptyMap = Map("one" -> 1, "two" -> 2, "three" -> 3)
    val emptyMap = Map.empty[String,Int]

    def seqToString[T](seq: Seq[T]): String = seq match {
      case a +: b => s"$a +: " + seqToString(b)
      case Nil => "Nil"
    }

    for { seq <- Seq(nonEmptySeq, emptySeq, nonEmptySeq, emptyList,
    nonEmptyVector, emptyVector, nonEmptyMap.toSeq, emptyMap.toSeq) } println(seqToString(seq))
    pending
  }

  "Given fn(numbers:Int*)" - {
    def fn(numbers:Int*):Int = numbers.size
    "when called with a seq object, use :_* to expand the list items as arguments" in {
      val data = Seq(-9,44,5)
      fn(data:_*) should be (3)
    }
  }

  "Sliding window" in {
    val nonEmptyList = List(1, 2, 3, 4, 5)
    val emptyList = Nil
    val nonEmptyMap = Map("one" -> 1, "two" -> 2, "three" -> 3)

    def window[T](seq: Seq[T]):String = seq match {
      case Seq(a, b, _*) => s"($a, $b), " + window(seq.tail)
      case Seq(a) => s"($a, _), " + window(seq.tail)
      case Nil => "Nil"
    }

    for (seq <- Seq(nonEmptyList, emptyList, nonEmptyMap.toSeq)){
      println(window(seq))
    }

  }

}
