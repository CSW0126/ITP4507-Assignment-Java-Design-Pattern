package ict.Food.Drink;

import ict.ControlMenu;

public abstract class Drink {
    private ControlMenu controlMenu;

    public Drink(ControlMenu controlMenu) {
        this.controlMenu = controlMenu;
    }

    public String getPartName() {
        return controlMenu.getTagLib().getMsg("t801");
    }

    public ControlMenu getControlMenu() {
        return controlMenu;
    }

    // abstract method
    public abstract String getDrinkName();

}
