import cats.Eval
import cats.Id
import github4s.Github
import github4s.Github._
import github4s.GithubResponses.{GHIO, GHResponse}
import github4s.free.domain.User
import github4s.free.interpreters.Interpreters
import github4s.jvm.Implicits._
import scalaj.http.HttpResponse

object Hello extends App {
  def appListContributors: GHResponse[List[User]] = {
    val contributors: GHIO[GHResponse[List[User]]] = Github().repos.listContributors("suhasgaddam", "dummy-sonatype")

    type C = HttpResponse[String]
    val response: GHResponse[List[User]] = contributors.exec[Id, C](Map())(implicitly[Interpreters[Id, C]], idMonad, extensionJVM[Id](idCaptureInstance))

   response
  }

  println("Hello World!")

  println(appListContributors)
}
