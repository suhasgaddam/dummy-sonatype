import sbtorgpolicies.model.GitHubSettings
import sbtorgpolicies.runnable.syntax._

scalaVersion := sbtorgpolicies.model.scalac.`2.11`

name := "dummy-sonatype"

description := name.value
startYear := Option(2017)

orgAfterCISuccessCheckSetting := true

pgpPassphrase := Some(getEnvVar("PGP_PASSPHRASE").getOrElse("").toCharArray)

orgGithubSetting := GitHubSettings(
  organization = "suhasgaddam",
  project = (name in LocalRootProject).value,
  organizationName = "Suhas Gaddam",
  groupId = "com.suhasgaddam.dummy",
  organizationHomePage = url("http://suhasgaddam.com"),
  organizationEmail = "suhas.g.2011@gmail.com"
)

orgAfterCISuccessTaskListSetting := List(
  orgUpdateDocFiles.asRunnableItem,
  depUpdateDependencyIssues.asRunnableItem,
  orgPublishReleaseTask
    .asRunnableItem(allModules = true, aggregated = true, crossScalaVersions = true)
)
