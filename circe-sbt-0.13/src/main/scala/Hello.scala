import io.circe._
import io.circe.parser._

object Hello extends App {
  def appRawDecode: Either[io.circe.ParsingFailure,io.circe.Json] = {
    val raw: String = """
      [
        {
          "login": "suhasgaddam",
          "id": 7282584,
          "avatar_url": "https://avatars2.githubusercontent.com/u/7282584?v=4",
          "gravatar_id": "",
          "url": "https://api.github.com/users/suhasgaddam",
          "html_url": "https://github.com/suhasgaddam",
          "followers_url": "https://api.github.com/users/suhasgaddam/followers",
          "following_url": "https://api.github.com/users/suhasgaddam/following{/other_user}",
          "gists_url": "https://api.github.com/users/suhasgaddam/gists{/gist_id}",
          "starred_url": "https://api.github.com/users/suhasgaddam/starred{/owner}{/repo}",
          "subscriptions_url": "https://api.github.com/users/suhasgaddam/subscriptions",
          "organizations_url": "https://api.github.com/users/suhasgaddam/orgs",
          "repos_url": "https://api.github.com/users/suhasgaddam/repos",
          "events_url": "https://api.github.com/users/suhasgaddam/events{/privacy}",
          "received_events_url": "https://api.github.com/users/suhasgaddam/received_events",
          "type": "User",
          "site_admin": false,
          "contributions": 21
        }
      ]
    """

    val parseResult: Either[io.circe.ParsingFailure,io.circe.Json] = parse(raw)

    parseResult
  }

  println("Hello World!")

  println(appRawDecode)
}
