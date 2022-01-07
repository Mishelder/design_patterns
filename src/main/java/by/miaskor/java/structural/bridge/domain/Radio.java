package by.miaskor.java.structural.bridge.domain;

public class Radio extends Device {

  private String fmStation;

  public Radio() {
    super(0);
  }

  public Radio(Integer volume) {
    super(volume);
  }

  public String getFmStation() {
    return fmStation;
  }

  public void setFmStation(String fmStation) {
    this.fmStation = fmStation;
  }
}
