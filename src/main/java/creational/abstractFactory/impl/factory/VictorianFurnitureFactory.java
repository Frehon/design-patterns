package creational.abstractFactory.impl.factory;

import creational.abstractFactory.api.factory.FurnitureFactory;
import creational.abstractFactory.api.furniture.CoffeeTable;
import creational.abstractFactory.api.furniture.Sofa;
import creational.abstractFactory.impl.furniture.VictorianChair;
import creational.abstractFactory.impl.furniture.VictorianCoffeeTable;
import creational.abstractFactory.impl.furniture.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public VictorianChair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
