package by.miaskor.java.structural.bridge.domain;

public class AdvancedRemote extends Remote{

  private Integer oldVolume;

  public AdvancedRemote(Device device) {
    super(device);
    super.VOLUME_DELTA = 20;
  }

  public void mute(){
    oldVolume = device.getVolume();
    device.setVolume(0);
  }

  public void unMute(){
    device.setVolume(oldVolume);
  }
}
