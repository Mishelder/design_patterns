package by.miaskor.kotlin.creational.abstract_factory.factory

import by.miaskor.kotlin.creational.abstract_factory.domain.ElementType
import by.miaskor.kotlin.creational.abstract_factory.domain.MacButton
import by.miaskor.kotlin.creational.abstract_factory.domain.MacCheckBox
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.Mockito.mock

internal class MacFactoryTest {

  private val factory =mock(MacFactory::class.java)

  @Test
  fun createButton() {
    val macButton = MacButton()
    Mockito.`when`(factory.createButton())
      .thenReturn(macButton)
    assertEquals(macButton, factory.createButton())
  }

  @Test
  fun createCheckBox() {
    val macCheckBox = MacCheckBox()
    Mockito.`when`(factory.createCheckBox())
      .thenReturn(macCheckBox)
    assertEquals(macCheckBox, factory.createCheckBox())
  }

  @Test
  fun createPinnableElement() {
    val macCheckBox = MacCheckBox()
    Mockito.`when`(factory.createPinnableElement(ElementType.CHECK_BOX))
      .thenReturn(macCheckBox)
    assertEquals(macCheckBox, factory.createPinnableElement(ElementType.CHECK_BOX))
  }
}
