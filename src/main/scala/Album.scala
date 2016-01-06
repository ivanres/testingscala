package com.oreilly.testingscala

class Album (val title:String, val year:Int, val acts:Act*){
  require(acts.size > 0)
}