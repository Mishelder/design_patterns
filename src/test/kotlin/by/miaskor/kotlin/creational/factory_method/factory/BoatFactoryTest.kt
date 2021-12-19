package by.miaskor.kotlin.creational.factory_method.factory

import by.miaskor.kotlin.creational.factory_method.domain.Boat
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

internal class BoatFactoryTest {

  private val transportFactory = mock(BoatFactory::class.java)

  @Test
  fun make() {
    val expected = Boat()
    `when`(transportFactory.make())
      .thenReturn(expected)
    val actual = transportFactory.make()
    Assertions.assertEquals(expected, actual)
  }
}
