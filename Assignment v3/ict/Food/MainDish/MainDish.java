package ict.Food.MainDish;

import ict.ControlMenu;

public abstract class MainDish {
    private ControlMenu controlMenu;

    public MainDish(ControlMenu controlMenu) {
        this.controlMenu = controlMenu;
    }

    public String getPartname() {
        return controlMenu.getTagLib().getMsg("t802");
    }

    public ControlMenu getControlMenu() {
        return controlMenu;
    }

    // abstract Method
    public abstract String getMainDishName();
}
