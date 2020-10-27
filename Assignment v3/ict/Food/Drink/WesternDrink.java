package ict.Food.Drink;

import ict.ControlMenu;

public class WesternDrink extends Drink {
    private String drinkName;

    public WesternDrink(ControlMenu controlMenu, String drinkName) {
        super(controlMenu);
        this.drinkName = drinkName;
    }

    @Override
    public String getDrinkName() {
        return drinkName;
    }

}
