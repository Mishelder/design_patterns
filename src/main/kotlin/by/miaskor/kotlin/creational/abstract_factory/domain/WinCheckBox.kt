package by.miaskor.kotlin.creational.abstract_factory.domain

class WinCheckBox : CheckBox {
  override fun showCheckBox() {
    println("It is WinCheckBox")
  }

  override fun pin() {
    println("Pin WinCheckBox")
  }
}
