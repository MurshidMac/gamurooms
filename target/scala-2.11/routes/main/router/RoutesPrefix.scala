
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/murshidhassen/Documents/Projects/gamurooms/conf/routes
// @DATE:Tue Jul 24 07:06:55 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
