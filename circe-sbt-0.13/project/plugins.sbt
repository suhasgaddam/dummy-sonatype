addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core" % "0.9.0-M1",
  "io.circe" %% "circe-generic" % "0.9.0-M1",
  "io.circe" %% "circe-parser" % "0.9.0-M1"
)
