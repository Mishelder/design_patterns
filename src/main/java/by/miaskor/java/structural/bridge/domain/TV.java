package by.miaskor.java.structural.bridge.domain;

public class TV extends Device{

  private String chanel;

  public TV() {
    super(0);
  }

  public TV(Integer volume) {
    super(volume);
  }

  public String getChanel() {
    return chanel;
  }

  public void setChanel(String chanel) {
    this.chanel = chanel;
  }
}
