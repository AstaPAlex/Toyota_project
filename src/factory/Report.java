package factory;

import car.Car;
import java.io.FileWriter;
import java.io.IOException;

public class Report {
    private final String nameManager;
    private Car[] carsSold = new Car[1000];
    private int countCarsSold = 0;
    private double costPrice = 0;
    private double price = 0;

    public Report(String nameManager) {
        this.nameManager = nameManager;
    }

    public void addCarInReport(Car car) {
        carsSold[countCarsSold] = car;
        countCarsSold++;
        price += car.getPrice();
        costPrice += car.getTypeCar().getCostPrice();
    }

    public void saveReport() {
        try (FileWriter fileWriter = new FileWriter("Report.txt", false)) {
            String text;
            for (int i = 0; i < countCarsSold; i++) {
                text = "Модель №" + (i + 1) + " - Продажа: " + carsSold[i].getPrice()
                        + " Себестоимость: " + carsSold[i].getTypeCar().getCostPrice() + "\n";
                fileWriter.write(text);
            }
            fileWriter.write("Итог: доходы: " + price + ", расходы: " + costPrice
                    + ", прибыль: " + (price - costPrice));
            System.out.println("Отчет о продажах сохранен!");
        } catch (IOException e) {
            System.out.println("Отчет не сохранен!");
        }
    }
}
