scalaVersion := "2.10.6"

name := "dummy-sonatype"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core" % "0.9.0-M1",
  "io.circe" %% "circe-generic" % "0.9.0-M1",
  "io.circe" %% "circe-parser" % "0.9.0-M1"
)
