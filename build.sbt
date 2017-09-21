scalaVersion := "2.12.3"

organization := "com.suhasgaddam.dummy"

name := "dummy-sonatype"

orgAfterCISuccessCheckSetting := true

import sbtorgpolicies.runnable.syntax._
orgAfterCISuccessTaskListSetting := List(
  orgPublishReleaseTask.asRunnableItem(allModules = true,
                                       aggregated = false,
                                       crossScalaVersions = true)
)
