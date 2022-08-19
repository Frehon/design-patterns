package creational.abstractFactory.impl.furniture;

import creational.abstractFactory.api.furniture.Chair;

public class VictorianChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on the victorian chair");
    }
}
