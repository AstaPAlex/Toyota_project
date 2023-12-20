package car.equipment;

public class MiniIceBox {
    public static final String TEXT_COOL = "Напиток охлажден!\n";

    public void coolDrink() {
        System.out.println(TEXT_COOL);
    }

    public boolean hasMiniIceBox() {
        return true;
    }
}
