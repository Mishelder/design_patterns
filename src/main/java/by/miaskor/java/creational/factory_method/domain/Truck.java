package by.miaskor.java.creational.factory_method.domain;

public class Truck implements Transport {

  @Override
  public void delivery() {
    System.out.println("It's a truck");
  }
}
