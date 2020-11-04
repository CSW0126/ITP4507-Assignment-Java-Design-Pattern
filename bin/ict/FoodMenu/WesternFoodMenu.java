package ict.FoodMenu;

import ict.ControlMenu;
import ict.Food.MainDish.IMainDish;
import ict.TagLib.TagLib;

public class WesternFoodMenu extends AbstractFoodMenu {
    private TagLib tagLib;

    public WesternFoodMenu(ControlMenu controlMenu, IMainDish mainDish, int price, int count) {
        super(controlMenu, mainDish, price, count);
        this.tagLib = controlMenu.getTagLib();
    }

    @Override
    public String toString() {
        return "\n" + tagLib.getMsg("t206") + "\n" + tagLib.getMsg("t202") + getMainDish().getMainDishName() + "\n"
                + tagLib.getMsg("t207") + "\n" + tagLib.getMsg("t204") + getPrice() + "\n" + tagLib.getMsg("t205")
                + getCount() + "\n";
    }
}
