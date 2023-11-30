import car.*;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Camry("Синий", "АКПП", 12000.12));
        cars.add(new Hiance("Красный", "Механика", 20500));
        cars.add(new Dyna("Черный", "Робот", 17000));
        cars.add(new Solara("Белый>", "АКПП", 14000));
        for (Car car : cars) {
            car.functionalTesting();
        }
    }
}
