package creational.abstractFactory.impl.furniture;

import creational.abstractFactory.api.furniture.CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public int numberOfLegs() {
        return 0;
    }

    @Override
    public void putCupOn() {
        System.out.println("Putting cup of coffee on the art deco table");
    }
}
