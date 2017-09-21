scalaVersion := sbtorgpolicies.model.scalac.`2.11`

organization := "com.suhasgaddam.dummy"

name := "dummy-sonatype"

description := name.value
startYear := Option(2017)

orgAfterCISuccessCheckSetting := true

import sbtorgpolicies.runnable.syntax._
orgAfterCISuccessTaskListSetting := List(
  orgPublishReleaseTask.asRunnableItem(allModules = true,
                                       aggregated = true,
                                       crossScalaVersions = true)
)
