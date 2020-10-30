package ict.Order;

import ict.ControlMenu;
import ict.Food.Drink.IDrink;
import ict.Food.MainDish.IMainDish;
import ict.Food.SideDish.ISideDish;
import ict.FoodMenu.AbstractFoodMenu;
import ict.TagLib.TagLib;

public class ChineseOrder extends AbstractOrder {
    private AbstractFoodMenu chineseMenu;
    private IMainDish mainDish;
    private TagLib tagLib;

    public ChineseOrder(ControlMenu controlMenu, ISideDish sideDish, IDrink drink, int staffNo, int locationNo) {
        super(controlMenu, sideDish, drink, staffNo, locationNo);
        this.tagLib = controlMenu.getTagLib();
        this.chineseMenu = controlMenu.getChineseMenu();
        this.mainDish = chineseMenu.getMainDish();
    }

    // Getter Setter
    @Override
    public AbstractFoodMenu getMenu() {
        return chineseMenu;
    }

    @Override
    public void setMenu(AbstractFoodMenu chineseMenu) {
        this.chineseMenu = chineseMenu;
    }

    @Override
    public void setMainDish(IMainDish mainDish) {
        this.mainDish = mainDish;
    }

    @Override
    public IMainDish getMainDish() {
        return mainDish;
    }

    // End Getter Setter

    @Override
    public String toString() {
        return tagLib.getMsg("t402") + tagLib.getMsg("t405") + getStaffNo() + " " + tagLib.getMsg("t406")
                + getLocationNo() + " " + mainDish.getMainDishName() + ", " + getSideDish().getSideDishName() + ", "
                + getDrink().getDrinkName();
    }

}
