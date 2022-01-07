package by.miaskor.java.structural.bridge.domain;

public abstract class Device {

  private Integer volume;
  private Boolean power;

  public Device(Integer volume) {
    this.volume = volume;
  }

  public boolean isEnabled(){
    return power;
  }

  public Integer getVolume() {
    return volume;
  }

  public void setVolume(Integer volume) {
    if(volume <= 100 && volume >= 0) {
      this.volume = volume;
    }
  }

  public Boolean getPower() {
    return power;
  }

  public void setPower(Boolean power) {
    this.power = power;
  }
}
