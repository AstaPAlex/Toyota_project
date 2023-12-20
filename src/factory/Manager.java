package factory;

import car.Car;
import car.TypeCar;

public class Manager {
    private String name;
    private final Report report;

    public Manager(String name) {
        this.name = name;
        report = new Report(name);
    }

    public Car sellCar(Shopper shopper, AssemblyLine assemblyLine, Warehouse warehouse) {
        Car soldCar;
        if (shopper.getMoney() >= 22_000) {
            soldCar = searchCar(TypeCar.DYNA, warehouse, assemblyLine);
            report.addCarInReport(soldCar);
            return soldCar;
        } else if (shopper.getMoney() >= 15_000) {
            soldCar = searchCar(TypeCar.HIANCE, warehouse, assemblyLine);
            report.addCarInReport(soldCar);
            return soldCar;
        } else if (shopper.getMoney() >= 12_000) {
            soldCar = searchCar(TypeCar.SOLARA, warehouse, assemblyLine);
            report.addCarInReport(soldCar);
            return soldCar;
        } else if (shopper. getMoney() >= 10_000) {
            soldCar = searchCar(TypeCar.CAMRY, warehouse, assemblyLine);
            report.addCarInReport(soldCar);
            return soldCar;
        } else {
            return null;
        }
    }

    private Car searchCar(TypeCar typeCar, Warehouse warehouse,
                          AssemblyLine assemblyLine) {
        if (warehouse.getCountTypeCar(typeCar) > 0) {
            return warehouse.getCar(typeCar);
        } else {
            return createNewCar(typeCar, assemblyLine);
        }
    }

    private Car createNewCar(TypeCar typeCar, AssemblyLine assemblyLine) {
        switch (typeCar) {
            case SOLARA -> {
                return assemblyLine.createSolara("black", 12_000);
            }
            case HIANCE -> {
                return assemblyLine.createHiance("black", 15_000);
            }
            case CAMRY -> {
                return assemblyLine.createCamry("black", 10_000);
            }
            case DYNA -> {
                return assemblyLine.createDyna("black", 22_000);
            }
        }
        return null;
    }

    public void saveReport() {
        report.saveReport();
    }

}
