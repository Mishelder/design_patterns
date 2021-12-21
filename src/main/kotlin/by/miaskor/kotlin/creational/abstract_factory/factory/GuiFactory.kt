package by.miaskor.kotlin.creational.abstract_factory.factory

import by.miaskor.kotlin.creational.abstract_factory.domain.Button
import by.miaskor.kotlin.creational.abstract_factory.domain.CheckBox
import by.miaskor.kotlin.creational.abstract_factory.domain.ElementType
import by.miaskor.kotlin.creational.abstract_factory.domain.Pinnable

interface GuiFactory {

  fun createButton(): Button
  fun createCheckBox(): CheckBox
  fun createPinnableElement(elementType: ElementType): Pinnable
}
