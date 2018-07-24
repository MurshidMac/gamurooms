
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object nav_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class nav extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<nav class="navbar navbar-default navbar-static-top navbar-inverse">
  <div class="container">
    <div><h1>First Element</h1></div>
  </div>
</nav>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object nav extends nav_Scope0.nav
              /*
                  -- GENERATED --
                  DATE: Tue Jul 24 07:06:56 IST 2018
                  SOURCE: /Users/murshidhassen/Documents/Projects/gamurooms/app/views/nav.scala.html
                  HASH: f5f6959ad362337aea721292b1e37ec9cf4d02a7
                  MATRIX: 605->0
                  LINES: 25->1
                  -- GENERATED --
              */
          