package ict.FoodMenu;

import ict.ControlMenu;
import ict.Food.MainDish.IMainDish;

import ict.TagLib.TagLib;

public class ChineseFoodMenu extends AbstractFoodMenu {

    private TagLib tagLib;

    public ChineseFoodMenu(ControlMenu controlMenu, IMainDish mainDish, int price, int count) {
        super(controlMenu, mainDish, price, count);
        tagLib = controlMenu.getTagLib();
    }

    @Override
    public String toString() {
        return "\n" + tagLib.getMsg("t201") + "\n" + tagLib.getMsg("t202") + getMainDish().getMainDishName() + "\n"
                + tagLib.getMsg("t203") + "\n" + tagLib.getMsg("t204") + getPrice() + "\n" + tagLib.getMsg("t205")
                + getCount() + "\n";
    }

}
