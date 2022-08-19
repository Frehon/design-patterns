package creational.abstractFactory.impl.furniture;

import creational.abstractFactory.api.furniture.Chair;

public class ModernChair implements Chair {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on modern chair");
    }
}
