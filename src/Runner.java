import car.*;
import car.exeption.StartCarException;
import factory.*;
import factory.exeption.CountyFactoryNotEqualException;

public class Runner {
    public static void main(String[] args) throws StartCarException,
            CountyFactoryNotEqualException {
        Fabric fabric = new Fabric(Country.JAPAN);
        AssemblyLine assemblyLine = new AssemblyLine(Country.JAPAN, fabric);
        Warehouse warehouse = new Warehouse();
        Shopper[] shoppers = createShoppers();
        createCarsAddWarehouse(assemblyLine, warehouse);
        Manager manager = new Manager("Володя");
        double sum = sellCars(manager, shoppers, assemblyLine, warehouse);
        System.out.println("Общая выручка: " + sum);
        manager.saveReport();
    }

    private static Shopper[] createShoppers() {
        Shopper shopper1 = new Shopper("Alex1", 10_000);
        Shopper shopper2 = new Shopper("Alex2", 12_000);
        Shopper shopper3 = new Shopper("Alex3", 15_000);
        Shopper shopper4 = new Shopper("Alex4", 22_000);
        Shopper shopper5 = new Shopper("Alex5", 11_000);
        Shopper shopper6 = new Shopper("Alex6", 13_000);
        Shopper shopper7 = new Shopper("Alex7", 8_000);
        Shopper shopper8 = new Shopper("Alex8", 30_000);
        return new Shopper[] {shopper1, shopper2, shopper3,
            shopper4, shopper5, shopper6, shopper7, shopper8};
    }

    private static void createCarsAddWarehouse(AssemblyLine assemblyLine, Warehouse warehouse) {
        Camry camry = assemblyLine.createCamry("black", 10_000);
        Solara solara = assemblyLine.createSolara("white", 12_000);
        Hiance hiance = assemblyLine.createHiance("black", 15_000);
        Dyna dyna = assemblyLine.createDyna("black", 22_000);
        warehouse.addCar(camry);
        warehouse.addCar(solara);
        warehouse.addCar(hiance);
        warehouse.addCar(dyna);
    }

    private static double sellCars(Manager manager, Shopper[] shoppers,
                                   AssemblyLine assemblyLine, Warehouse warehouse) {
        double sum = 0;
        for (Shopper shopper : shoppers) {
            Car car = manager.sellCar(shopper, assemblyLine, warehouse);
            if (car == null) {
                System.out.println("Машина не продана!");
                continue;
            }
            System.out.println("Машина продана: " + car.getTypeCar());
            sum += car.getPrice();
        }
        return sum;
    }

}
