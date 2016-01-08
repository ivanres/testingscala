package com.oreilly.testingscala
class Jukebox(val albums: Option[List[Album]]) {

  val readyToPlay = albums.isDefined

}
