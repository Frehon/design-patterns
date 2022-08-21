package structural.bridge.api;

public interface Remote {
    public void clickTurnOn();
    public void clickVolumeUp();
    public void clickVolumeDown();
    public void clickNextChannel();
    public void clickPreviousChannel();
    public void setChannel(int channel);
}
