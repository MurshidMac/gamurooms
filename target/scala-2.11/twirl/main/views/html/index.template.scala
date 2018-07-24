
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("App")/*3.13*/ {_display_(Seq[Any](format.raw/*3.15*/("""

"""),format.raw/*5.1*/("""<div class="jumbotron text-center">
  <div class="container">

  </div>
</div>


""")))}),format.raw/*12.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Jul 24 07:06:56 IST 2018
                  SOURCE: /Users/murshidhassen/Documents/Projects/gamurooms/app/views/index.scala.html
                  HASH: 82343b08e963ca5bda3bc18159e5a00b7624a282
                  MATRIX: 527->1|639->18|667->21|686->32|725->34|753->36|865->118
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|36->12
                  -- GENERATED --
              */
          