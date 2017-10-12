addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")

libraryDependencies ++= Seq(
  "com.47deg" %% "github4s" % "0.16.0",
  "org.typelevel" %% "cats-core" % "1.0.0-MF",
  "org.typelevel" %% "cats-free" % "1.0.0-MF"
)
