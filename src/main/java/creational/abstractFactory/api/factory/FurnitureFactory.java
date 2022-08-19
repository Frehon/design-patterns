package creational.abstractFactory.api.factory;

import creational.abstractFactory.api.furniture.Chair;
import creational.abstractFactory.api.furniture.CoffeeTable;
import creational.abstractFactory.api.furniture.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}
