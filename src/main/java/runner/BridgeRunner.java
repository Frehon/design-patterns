package runner;

import structural.bridge.api.Device;
import structural.bridge.api.Remote;
import structural.bridge.impl.AdvancedRemote;
import structural.bridge.impl.BasicRemote;
import structural.bridge.impl.Radio;
import structural.bridge.impl.Tv;

public class BridgeRunner {
    public void run() {
        Device tv = new Tv();
        Device radio = new Radio();

        Remote radioRemote = new BasicRemote(radio);
        AdvancedRemote tvRemote = new AdvancedRemote(tv);

        System.out.println("Starting point...");
        radio.getState();
        tv.getState();

        System.out.println("Turning on...");
        radioRemote.clickTurnOn();
        tvRemote.clickTurnOn();

        System.out.println("Volume up + 20% for both devices");
        radioRemote.clickVolumeUp();
        radioRemote.clickVolumeUp();
        radio.getState();
        tvRemote.clickVolumeUp();
        tvRemote.clickVolumeUp();
        tv.getState();

        System.out.println("Changing channel for radio to 2 and for tv to 5");
        radioRemote.setChannel(2);
        tvRemote.setChannel(5);
        radio.getState();
        tv.getState();

        System.out.println("Next channel...");
        radioRemote.clickNextChannel();
        tvRemote.clickNextChannel();
        radio.getState();
        tv.getState();

        System.out.println("Previous channel...");
        radioRemote.clickPreviousChannel();
        tvRemote.clickPreviousChannel();
        radio.getState();
        tv.getState();

        System.out.println("Muting tv - advanced option");
        tvRemote.mute();
        tv.getState();
    }
}
