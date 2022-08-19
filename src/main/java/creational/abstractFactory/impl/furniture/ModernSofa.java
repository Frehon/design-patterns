package creational.abstractFactory.impl.furniture;

import creational.abstractFactory.api.furniture.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on the modern sofa");
    }
}
