package creational.abstractFactory.impl.furniture;

import creational.abstractFactory.api.furniture.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public void putCupOn() {
        System.out.println("Putting cup of coffee on the victorian cofee table");
    }
}
