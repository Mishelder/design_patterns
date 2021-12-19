package by.miaskor.java.creational.factory_method.factory;

import by.miaskor.java.creational.factory_method.domain.Truck;

public class TruckFactory implements TransportFactory {

  @Override
  public Truck make() {
    return new Truck();
  }
}
