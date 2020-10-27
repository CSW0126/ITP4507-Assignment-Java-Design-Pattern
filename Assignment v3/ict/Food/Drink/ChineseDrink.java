package ict.Food.Drink;

import ict.ControlMenu;

public class ChineseDrink extends Drink {
    private String drinkName;

    public ChineseDrink(ControlMenu controlMenu, String drinkName) {
        super(controlMenu);
        this.drinkName = drinkName;
    }

    @Override
    public String getDrinkName() {
        return drinkName;
    }

}
