package creational.abstractFactory.impl.factory;

import creational.abstractFactory.api.factory.FurnitureFactory;
import creational.abstractFactory.impl.furniture.ArtDecoChair;
import creational.abstractFactory.impl.furniture.ArtDecoCoffeeTable;
import creational.abstractFactory.impl.furniture.ArtDecoSofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public ArtDecoChair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public ArtDecoCoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public ArtDecoSofa createSofa() {
        return new ArtDecoSofa();
    }
}
