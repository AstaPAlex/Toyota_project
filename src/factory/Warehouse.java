package factory;

import car.*;

public class Warehouse {
    private int countFree = 1000;
    private final Car[] cars = new Car[countFree];
    private int countCamry = 0;
    private int countSolara = 0;
    private int countDyna = 0;
    private int countHiance = 0;

    public void addCar(Car car) {
        if (!checkFree()) {
            return;
        }
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = car;
                countFree--;
                changeCountType(car.getTypeCar(), 1);
                return;
            }
        }
    }

    private void changeCountType(TypeCar typeCar, int num) {
        switch (typeCar) {
            case DYNA -> {
                countDyna = countDyna + num;
            }
            case CAMRY ->  {
                countCamry = countCamry + num;
            }
            case HIANCE -> {
                countHiance = countHiance + num;
            }
            case SOLARA -> {
                countSolara = countSolara + num;
            }
        }
    }

    public Car getCar(TypeCar typeCar) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                continue;
            }
            if (cars[i].getTypeCar().equals(typeCar)) {
                countFree++;
                changeCountType(typeCar, -1);
                Car car = cars[i];
                cars[i] = null;
                return car;
            }
        }
        return null;
    }

    private boolean checkFree() {
        return countFree > 0;
    }

    public int getCountTypeCar(TypeCar typeCar) {
        switch (typeCar) {
            case DYNA -> {
                return countDyna;
            }
            case CAMRY -> {
                return countCamry;
            }
            case HIANCE -> {
                return countHiance;
            }
            case SOLARA -> {
                return countSolara;
            }
        }
        return -1;
    }

}
