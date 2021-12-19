package by.miaskor.java.creational.factory_method.factory;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import by.miaskor.java.creational.factory_method.domain.Transport;
import by.miaskor.java.creational.factory_method.domain.Truck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TruckFactoryTest {

  private final TransportFactory transportFactory = mock(TruckFactory.class);

  @Test
  void make() {
    Transport expected = new Truck();
    when(transportFactory.make())
        .thenReturn(expected);
    Transport actual = transportFactory.make();
    Assertions.assertEquals(expected, actual);
  }
}
