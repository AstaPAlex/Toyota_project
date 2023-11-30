package car;

import car.equipment.MiniIceBox;

public class Solara extends Cabriolet {
    private MiniIceBox miniIceBox;

    public Solara(String color, String transmission, double price) {
        super(color, transmission, price, 16);
        miniIceBox = new MiniIceBox();
    }

    @Override
    public boolean functionalTesting() {
        super.functionalTesting();
        System.out.printf("Наличие минихолодильника: %b \n", true);
        System.out.println("__________________________________");
        return true;
    }

}
