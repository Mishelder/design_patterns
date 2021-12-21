package by.miaskor.kotlin.creational.abstract_factory.domain

class MacButton : Button {
  override fun showButton() {
    println("It is MacButton")
  }

  override fun pin() {
    println("Pin button")
  }
}
