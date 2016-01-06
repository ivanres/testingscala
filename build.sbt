name := "Testing Scala"
version := "1.0"
scalaVersion := "2.11.6"
libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.2.4" % "test",
//  "joda-time" % "joda-time" % "1.6.2",
  "org.specs2" %% "specs2-core"  % "3.7" % "test")

scalacOptions in Test ++= Seq("-Yrangepos")
