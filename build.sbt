scalaVersion := "2.12.3"

organization := "com.suhasgaddam.dummy"

name := "dummy-sonatype"

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)
