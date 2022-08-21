package structural.bridge.api;

public interface Device {

    public boolean isEnabled();
    public void turnOn();
    public void turnOff();
    public void volumeUp();
    public void volumeDown();
    public void setVolume(int volume);
    public void setNextChannel();
    public void setPreviousChannel();
    public void setChannel(int channel);
    public void getState();
}
