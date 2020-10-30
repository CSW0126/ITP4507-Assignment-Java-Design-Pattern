package ict.Order;

import ict.ControlMenu;
import ict.Food.Drink.IDrink;
import ict.Food.MainDish.IMainDish;
import ict.Food.SideDish.ISideDish;
import ict.FoodMenu.AbstractFoodMenu;
import ict.TagLib.TagLib;

public class WesternOrder extends AbstractOrder {
    private AbstractFoodMenu westernMenu;
    private TagLib tagLib;
    private IMainDish mainDish;

    public WesternOrder(ControlMenu controlMenu, ISideDish sideDish, IDrink drink, int staffNo, int locationNo) {
        super(controlMenu, sideDish, drink, staffNo, locationNo);
        this.tagLib = controlMenu.getTagLib();
        this.westernMenu = controlMenu.getWesternMenu();
        this.mainDish = westernMenu.getMainDish();
    }

    // Getter Setter
    @Override
    public AbstractFoodMenu getMenu() {
        return westernMenu;
    }

    @Override
    public void setMenu(AbstractFoodMenu westernMenu) {
        this.westernMenu = westernMenu;
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
        return tagLib.getMsg("t403") + tagLib.getMsg("t405") + getStaffNo() + " " + tagLib.getMsg("t406")
                + getLocationNo() + " " + mainDish.getMainDishName() + ", " + getSideDish().getSideDishName() + ", "
                + getDrink().getDrinkName();
    }

}
