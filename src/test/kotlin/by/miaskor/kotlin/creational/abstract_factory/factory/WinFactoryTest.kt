package by.miaskor.kotlin.creational.abstract_factory.factory

import by.miaskor.kotlin.creational.abstract_factory.domain.ElementType
import by.miaskor.kotlin.creational.abstract_factory.domain.WinButton
import by.miaskor.kotlin.creational.abstract_factory.domain.WinCheckBox
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito

internal class WinFactoryTest {

  private val factory = Mockito.mock(WinFactory::class.java)

  @Test
  fun createButton() {
    val macButton = WinButton()
    Mockito.`when`(factory.createButton())
      .thenReturn(macButton)
    assertEquals(macButton, factory.createButton())
  }

  @Test
  fun createCheckBox() {
    val macCheckBox = WinCheckBox()
    Mockito.`when`(factory.createCheckBox())
      .thenReturn(macCheckBox)
    assertEquals(macCheckBox, factory.createCheckBox())
  }

  @Test
  fun createPinnableElement() {
    val macCheckBox = WinCheckBox()
    Mockito.`when`(factory.createPinnableElement(ElementType.CHECK_BOX))
      .thenReturn(macCheckBox)
    assertEquals(macCheckBox, factory.createPinnableElement(ElementType.CHECK_BOX))
  }
}
