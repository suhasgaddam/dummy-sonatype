scalaVersion := "2.10.6"

name := "dummy-sonatype"

libraryDependencies ++= Seq(
  "com.47deg" %% "github4s" % "0.16.0",
  "org.typelevel" %% "cats-core" % "1.0.0-MF",
  "org.typelevel" %% "cats-free" % "1.0.0-MF"
)
