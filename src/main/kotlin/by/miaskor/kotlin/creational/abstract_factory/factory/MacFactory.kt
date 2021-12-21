package by.miaskor.kotlin.creational.abstract_factory.factory

import by.miaskor.kotlin.creational.abstract_factory.domain.ElementType
import by.miaskor.kotlin.creational.abstract_factory.domain.MacButton
import by.miaskor.kotlin.creational.abstract_factory.domain.MacCheckBox

class MacFactory : GuiFactory {
  override fun createButton() = MacButton()

  override fun createCheckBox() = MacCheckBox()

  override fun createPinnableElement(elementType: ElementType) =
    when(elementType){
      ElementType.BUTTON -> MacButton()
      ElementType.CHECK_BOX -> MacCheckBox()
    }
}
