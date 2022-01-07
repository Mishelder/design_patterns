package by.miaskor.java.structural.bridge.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoteTest {

  private final Device radio = new Radio();
  private final Remote remote = new SimpleRemote(radio);

  @Test
  void togglePower_whenPower_isOff() {
    boolean expected = true;
    remote.togglePower();
    boolean actual = radio.getPower();
    assertEquals(expected, actual);
  }

  @Test
  void togglePower_whenPower_isOn() {
    boolean expected = false;
    radio.setPower(true);
    remote.togglePower();
    boolean actual = radio.getPower();
    assertEquals(expected, actual);
  }

  @Test
  void volumeDown_AfterZeroVolume() {
    radio.setVolume(0);
    int expected = 0;
    remote.volumeDown();
    int actual = radio.getVolume();
    assertEquals(expected, actual);
  }

  @Test
  void volumeUp_AfterMaxVolume() {
    radio.setVolume(100);
    int expected = 100;
    remote.volumeUp();
    int actual = radio.getVolume();
    assertEquals(expected, actual);
  }

}
