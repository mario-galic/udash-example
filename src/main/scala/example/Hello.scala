package example
import io.udash._
import io.udash.css.CssView._
import io.udash.bootstrap._
import io.udash.bootstrap.alert._
import io.udash.bootstrap.form._
import io.udash.bootstrap.utils._
import org.scalajs.dom._
import scalatags.JsDom.all._

object Hello extends App {
  val name = Property("Udash")

  val udashJumbo = UdashJumbotron(
    div(BootstrapStyles.container)(
      UdashBootstrap.loadBootstrapStyles(),
      h1("Welcome to Udash!"),
      UdashForm(
        UdashForm.textInput()("Type your name: ")(name),
        UdashAlert.success("Hello, ", b(bind(name)), "!").render
      ).render
    )
  ).render

  document.body.appendChild(udashJumbo)
}

