package ict.Food.SideDish;

import ict.ControlMenu;

public class ChineseSideDish extends SideDish {
    private String sideDishName;

    public ChineseSideDish(ControlMenu controlMenu , String sideDishName) {
        super(controlMenu);
        this.sideDishName = sideDishName;
    }

    @Override
    public String getSideDishName() {
        return sideDishName;
    }
    
}
