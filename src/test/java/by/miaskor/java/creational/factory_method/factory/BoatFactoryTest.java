package by.miaskor.java.creational.factory_method.factory;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import by.miaskor.java.creational.factory_method.domain.Boat;
import by.miaskor.java.creational.factory_method.domain.Transport;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BoatFactoryTest {

  private final TransportFactory transportFactory = mock(BoatFactory.class);

  @Test
  void make() {
    Transport expected = new Boat();
    when(transportFactory.make())
        .thenReturn(expected);
    Transport actual = transportFactory.make();
    Assertions.assertEquals(expected, actual);
  }
}
