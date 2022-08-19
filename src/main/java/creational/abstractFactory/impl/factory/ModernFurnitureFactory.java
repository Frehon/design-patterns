package creational.abstractFactory.impl.factory;

import creational.abstractFactory.api.factory.FurnitureFactory;
import creational.abstractFactory.api.furniture.CoffeeTable;
import creational.abstractFactory.api.furniture.Sofa;
import creational.abstractFactory.impl.furniture.ModernChair;
import creational.abstractFactory.impl.furniture.ModernCoffeeTable;
import creational.abstractFactory.impl.furniture.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public ModernChair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
