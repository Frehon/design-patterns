import creational.abstractFactory.api.factory.FurnitureFactory;
import runner.AbstractFactoryRunner;
import runner.AdapterRunner;

public class Main {
    public static void main(String[] args) {

        String patternToShow = args[0];
        if (patternToShow != null) {
            switch (patternToShow) {
                case "abstractFactory" -> {
                    System.out.println("Running abstract factory example...");
                    AbstractFactoryRunner abstractFactoryRunner = new AbstractFactoryRunner();
                    abstractFactoryRunner.createEnvironment();
                    abstractFactoryRunner.run();
                }
                case "adapter" -> {
                    System.out.println("Running adapter example...");
                    AdapterRunner adapterRunner = new AdapterRunner();
                    adapterRunner.run();
                }
                default -> throw new RuntimeException("No pattern with this name found");
            }

        }


    }
}
