package by.miaskor.java.creational.factory_method;

import by.miaskor.java.creational.factory_method.factory.BoatFactory;
import by.miaskor.java.creational.factory_method.factory.TruckFactory;

public class MainApp {

  public static void main(String[] args) {
    System.out.println(new BoatFactory().make());
    System.out.println(new TruckFactory().make());
  }

}
