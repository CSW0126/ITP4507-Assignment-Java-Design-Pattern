package ict.Food.SideDish;

import ict.ControlMenu;

public class WesternSideDish extends SideDish {
    private String sideDishName;

    public WesternSideDish(ControlMenu controlMenu, String sideDishName) {
        super(controlMenu);
        this.sideDishName = sideDishName;
    }

    @Override
    public String getSideDishName() {
        return sideDishName;
    }

}
