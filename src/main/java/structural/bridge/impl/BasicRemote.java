package structural.bridge.impl;

import structural.bridge.api.Device;
import structural.bridge.api.Remote;

public class BasicRemote implements Remote {

    protected Device device;

    public BasicRemote() {
    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void clickTurnOn() {
        if (device.isEnabled()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    @Override
    public void clickVolumeUp() {
        device.volumeUp();
    }

    @Override
    public void clickVolumeDown() {
        device.volumeDown();
    }

    @Override
    public void clickNextChannel() {
        device.setNextChannel();
    }

    @Override
    public void clickPreviousChannel() {
        device.setPreviousChannel();
    }

    @Override
    public void setChannel(int channel) {
        device.setChannel(channel);
    }
}
