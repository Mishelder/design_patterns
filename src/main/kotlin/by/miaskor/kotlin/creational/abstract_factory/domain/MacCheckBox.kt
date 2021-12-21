package by.miaskor.kotlin.creational.abstract_factory.domain

class MacCheckBox : CheckBox {
  override fun showCheckBox() {
    println("It is MacCheckBox")
  }

  override fun pin() {
    println("Pin MacCheckBox")
  }
}
