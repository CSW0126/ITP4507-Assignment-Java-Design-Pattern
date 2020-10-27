package ict.Food.SideDish;

import ict.ControlMenu;

public abstract class SideDish {
    private ControlMenu controlMenu;

    public SideDish(ControlMenu controlMenu) {
        this.controlMenu = controlMenu;
    }

    public String getPartName() {
        return controlMenu.getTagLib().getMsg("t803");
    }

    public ControlMenu getControlMenu() {
        return controlMenu;
    }

    // abstract Method
    public abstract String getSideDishName();
}
