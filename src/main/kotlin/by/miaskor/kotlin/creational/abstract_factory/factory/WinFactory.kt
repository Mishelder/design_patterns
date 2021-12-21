package by.miaskor.kotlin.creational.abstract_factory.factory

import by.miaskor.kotlin.creational.abstract_factory.domain.ElementType
import by.miaskor.kotlin.creational.abstract_factory.domain.WinButton
import by.miaskor.kotlin.creational.abstract_factory.domain.WinCheckBox

class WinFactory : GuiFactory {
  override fun createButton() = WinButton()

  override fun createCheckBox() = WinCheckBox()

  override fun createPinnableElement(elementType: ElementType) =
    when(elementType){
      ElementType.BUTTON -> WinButton()
      ElementType.CHECK_BOX -> WinCheckBox()
    }
}
