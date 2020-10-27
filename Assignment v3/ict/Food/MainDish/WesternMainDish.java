package ict.Food.MainDish;

import ict.ControlMenu;

public class WesternMainDish extends MainDish {
    private String mainDishName;

    public WesternMainDish(ControlMenu controlMenu,String mainDishName) {
        super(controlMenu);
        this.mainDishName = mainDishName;
    }

    @Override
    public String getMainDishName() {
        return mainDishName;
    }
}
