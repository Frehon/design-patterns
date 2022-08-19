package runner;

import creational.abstractFactory.api.factory.FurnitureFactory;
import creational.abstractFactory.api.furniture.Chair;
import creational.abstractFactory.api.furniture.CoffeeTable;
import creational.abstractFactory.api.furniture.Sofa;
import creational.abstractFactory.impl.factory.ArtDecoFurnitureFactory;
import creational.abstractFactory.impl.factory.ModernFurnitureFactory;
import creational.abstractFactory.impl.factory.VictorianFurnitureFactory;

import java.util.Random;
public class AbstractFactoryRunner {
    private FurnitureFactory furnitureFactory;
    private String furnitureType;
    public void createEnvironment() {
        Random random = new Random();
        int factoryChoice = random.nextInt(3);
        switch (factoryChoice) {
            case 0 -> {
                furnitureFactory = new ModernFurnitureFactory();
                furnitureType = "modern";
            }
            case 1 -> {
                furnitureFactory = new VictorianFurnitureFactory();
                furnitureType = "victorian";
            }
            case 2 -> {
                furnitureFactory = new ArtDecoFurnitureFactory();
                furnitureType = "art deco";
            }
        }
        System.out.println("Chosen factory: " + furnitureFactory.getClass().getSimpleName());
    }

    public void run() {
        if (furnitureFactory == null) {
            throw new RuntimeException("Please run createEnvironment method before use");
        }
        System.out.println("Creating " + furnitureType + " chair...");
        Chair chair = furnitureFactory.createChair();
        System.out.println("Does the chair has legs? : " + chair.hasLegs());
        chair.sitOn();

        System.out.println("Creating " + furnitureType + " sofa...");
        Sofa sofa = furnitureFactory.createSofa();
        System.out.println("Does the sofa has legs? : " + sofa.hasLegs());
        sofa.sitOn();

        System.out.println("Creating " + furnitureType + "  coffee table...");
        CoffeeTable coffeeTable = furnitureFactory.createCoffeeTable();
        System.out.println("Does the coffee table has legs? : " + coffeeTable.hasLegs());
        System.out.println("How many legs has the coffee table? : " + coffeeTable.numberOfLegs());
    }
}
