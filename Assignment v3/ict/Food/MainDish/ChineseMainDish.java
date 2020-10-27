package ict.Food.MainDish;

import ict.ControlMenu;

public class ChineseMainDish extends MainDish {
    private String mainDishName;

    public ChineseMainDish(ControlMenu controlMenu, String mainDishName) {
        super(controlMenu);
        this.mainDishName = mainDishName;
    }

    @Override
    public String getMainDishName() {
        return mainDishName;
    }
}
