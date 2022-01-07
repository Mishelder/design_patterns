package by.miaskor.java.structural.bridge;

import by.miaskor.java.structural.bridge.domain.AdvancedRemote;
import by.miaskor.java.structural.bridge.domain.Device;
import by.miaskor.java.structural.bridge.domain.Radio;
import by.miaskor.java.structural.bridge.domain.Remote;

public class MainApp {

  public static void main(String[] args) {
    Device radio = new Radio();
    Remote remote = new AdvancedRemote(radio);

    System.out.println(radio.getPower());
    remote.togglePower();
    System.out.println(radio.getPower());
    System.out.println(radio.getVolume());
    remote.volumeUp();
    System.out.println(radio.getVolume());
    remote.volumeDown();
    remote.volumeDown();
    System.out.println(radio.getVolume());
    remote.volumeUp();
    remote.volumeUp();
    remote.volumeUp();
    remote.volumeUp();
    remote.volumeUp();
    remote.volumeUp();
    System.out.println(radio.getVolume());

  }
}
