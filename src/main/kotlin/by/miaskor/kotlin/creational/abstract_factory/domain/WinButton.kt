package by.miaskor.kotlin.creational.abstract_factory.domain

class WinButton : Button {
  override fun showButton() {
    println("It is WinButton")
  }

  override fun pin() {
    println("Pin button")
  }
}
