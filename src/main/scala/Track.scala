package com.oreilly.testingscala
class Track (name:String, length:String) {

  def this(name:String) = this(name, "0:00")

  def period = {
    val parsed = "PT" + length.replace(":", "M") + "S"
    println(s"Parsed length: $parsed")
    java.time.Duration.parse(parsed)
  }
}
