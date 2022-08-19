package creational.abstractFactory.impl.furniture;

import creational.abstractFactory.api.furniture.Chair;

public class ArtDecoChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on art deco chair");
    }
}
