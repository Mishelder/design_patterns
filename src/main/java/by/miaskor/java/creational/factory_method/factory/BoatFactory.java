package by.miaskor.java.creational.factory_method.factory;

import by.miaskor.java.creational.factory_method.domain.Boat;

public class BoatFactory implements TransportFactory {

  @Override
  public Boat make() {
    return new Boat();
  }
}
