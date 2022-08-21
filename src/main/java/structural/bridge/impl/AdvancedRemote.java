package structural.bridge.impl;

import structural.bridge.api.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    /**
     * Additional method for advanced remote
     */
    public void mute() {
        device.setVolume(0);
    }
}
