package by.miaskor.java.structural.bridge.domain;

public abstract class Remote {

  protected final Device device;
  protected Integer VOLUME_DELTA = 10;

  public Remote(Device device) {
    this.device = device;
  }

  public void togglePower(){
    device.setPower(!device.getPower());
  }
  public void volumeDown(){
    if((device.getVolume()-VOLUME_DELTA) >= 0) {
      device.setVolume(device.getVolume() - VOLUME_DELTA);
    }
  }
  public void volumeUp(){
    if((device.getVolume()+VOLUME_DELTA) <=100){
      device.setVolume(device.getVolume() + VOLUME_DELTA);
    }
  }
}
