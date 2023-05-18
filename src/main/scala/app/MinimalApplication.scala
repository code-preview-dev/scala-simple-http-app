package app
object MinimalApplication extends cask.MainRoutes{
  @cask.get("/")
  def hello() = {
    "Hello World!"
  }

  @cask.post("/do-thing")
  def doThing(request: cask.Request) = {
    request.text().reverse
  }

  override def port: Int = sys.env.get("HTTP_PORT").map(_.toInt).getOrElse(8080)
  initialize()
}
