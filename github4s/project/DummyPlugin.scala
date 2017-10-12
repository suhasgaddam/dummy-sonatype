import sbt.Keys._
import sbt._

import cats.Eval
import cats.Id
import github4s.Github
import github4s.Github._
import github4s.GithubResponses.{GHIO, GHResponse}
import github4s.free.domain.User
import github4s.free.interpreters.Interpreters
import github4s.jvm.Implicits._
import scalaj.http.HttpResponse

object DummyPlugin extends AutoPlugin {

  override def trigger: PluginTrigger = allRequirements

  object autoImport {
    lazy val listContributors = taskKey[GHResponse[List[User]]]("List Contributors")
  }

  import autoImport._

  override def projectSettings = Seq(
    listContributors := {
      val contributors: GHIO[GHResponse[List[User]]] = Github().repos.listContributors("suhasgaddam", "dummy-sonatype")

      type C = HttpResponse[String]
      val response: GHResponse[List[User]] = contributors.exec[Id, C](Map())(implicitly[Interpreters[Id, C]], idMonad, extensionJVM[Id](idCaptureInstance))

      response
    }
  )
}
