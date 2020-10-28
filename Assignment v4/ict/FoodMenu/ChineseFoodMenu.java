package ict.FoodMenu;

import ict.ControlMenu;
import ict.Food.MainDish.IMainDish;
import ict.TagLib.TagLib;

public class ChineseFoodMenu extends AbstractFoodMenu {

    private TagLib tagLib;
    public ChineseFoodMenu(ControlMenu controlMenu, IMainDish mainDish, int price, int count) {
        super(controlMenu, mainDish, price, count);
        tagLib = controlMenu.
    }

    @Override
    public String toString() {
        return "\n" + getControlMenu().getTagLib().getMsg("t201") + "\n" + getControlMenu().getTagLib().getMsg("t202")
                + getMainDish().getMainDishName() + "\n" + getControlMenu().getTagLib().getMsg("t203") + "\n"
                + getControlMenu().getTagLib().getMsg("t204") + getPrice() + "\n"
                + getControlMenu().getTagLib().getMsg("t205") + getCount() + "\n";
    }
    
}
