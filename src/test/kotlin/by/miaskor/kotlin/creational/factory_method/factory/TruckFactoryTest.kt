package by.miaskor.kotlin.creational.factory_method.factory

import by.miaskor.kotlin.creational.factory_method.domain.Truck
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.Mockito.mock

internal class TruckFactoryTest {

  private val transportFactory = mock(TruckFactory::class.java)

  @Test
  fun make() {
    val expected = Truck()
    Mockito.`when`(transportFactory.make())
      .thenReturn(expected)
    val actual = transportFactory.make()
    Assertions.assertEquals(expected, actual)
  }
}
