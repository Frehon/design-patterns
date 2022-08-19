package creational.abstractFactory.impl.furniture;

import creational.abstractFactory.api.furniture.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on the victorian sofa");
    }
}
