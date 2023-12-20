package factory;

public class Shopper {
    private double money;
    private String name;

    public Shopper(String name, double money) {
        this.money = money;
        this.name = name;
    }

    public double getMoney() {
        return money;
    }
}
