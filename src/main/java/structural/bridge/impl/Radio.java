package structural.bridge.impl;

import structural.bridge.api.Device;

public class Radio implements Device {
    boolean isEnabled = false;
    int volume = 0;
    int channel = 1;

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public void turnOn() {
        isEnabled = true;
    }

    @Override
    public void turnOff() {
        isEnabled = false;
    }

    @Override
    public void volumeUp() {
        if (volume >= 90) {
            volume = 100;
        } else {
            volume += 10;
        }
    }

    @Override
    public void volumeDown() {
        if (volume <= 10) {
            volume = 0;
        } else {
            volume -= 10;
        }
    }

    @Override
    public void setVolume(int volume) {
        if (volume < 0 || volume > 100) {
            return;
        }
        this.volume = volume;
    }

    @Override
    public void setNextChannel() {
        channel++;
    }

    @Override
    public void setPreviousChannel() {
        channel--;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void getState() {
        System.out.println("Radio is " + (isEnabled ? "On" : "Off") + ".");
        System.out.println("Current radio volume is: " + volume);
        System.out.println("Current radio channel is: " + channel);
    }
}
