package by.miaskor.kotlin.creational.abstract_factory

import by.miaskor.kotlin.creational.abstract_factory.domain.ElementType
import by.miaskor.kotlin.creational.abstract_factory.factory.MacFactory
import by.miaskor.kotlin.creational.abstract_factory.factory.WinFactory

private val winFactory = WinFactory()
private val macFactory = MacFactory()


fun main() {
  println(winFactory.createButton())
  println(winFactory.createCheckBox())
  println(macFactory.createButton())
  println(macFactory.createCheckBox())
  println(macFactory.createPinnableElement(ElementType.BUTTON))
  println(winFactory.createPinnableElement(ElementType.CHECK_BOX))
}
