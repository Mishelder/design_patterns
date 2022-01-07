package by.miaskor.java.structural.bridge.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AdvancedRemoteTest {


  private final TV tv = new TV(50);
  private final AdvancedRemote advancedRemote = new AdvancedRemote(tv);

  @Test
  void mute() {
    int expected = 0;
    advancedRemote.mute();
    int actual = tv.getVolume();
    assertEquals(expected,actual);
  }

  @Test
  void unMute() {
    int expected = 50;
    advancedRemote.mute();
    advancedRemote.unMute();
    int actual = tv.getVolume();
    assertEquals(expected, actual);
  }
}
