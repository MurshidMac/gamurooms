
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>GamuRooms</title>
        <link rel="stylesheet" type="text/css" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script type="text/javascript" src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.at("stylesheets/main.css")),format.raw/*11.95*/("""" />
    </head>
    <body>
        """),_display_(/*14.10*/nav()),format.raw/*14.15*/("""
        """),_display_(/*15.10*/content),format.raw/*15.17*/("""
    """),format.raw/*16.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Jul 24 07:06:56 IST 2018
                  SOURCE: /Users/murshidhassen/Documents/Projects/gamurooms/app/views/main.scala.html
                  HASH: d6fe0f8a403868df9b71fe6e1fb2b29f1f550814
                  MATRIX: 530->1|655->31|683->33|1167->490|1182->496|1237->530|1301->567|1327->572|1364->582|1392->589|1424->594
                  LINES: 20->1|25->1|27->3|35->11|35->11|35->11|38->14|38->14|39->15|39->15|40->16
                  -- GENERATED --
              */
          