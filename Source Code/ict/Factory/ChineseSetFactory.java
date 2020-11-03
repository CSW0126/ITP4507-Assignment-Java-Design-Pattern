package ict.Factory;

import ict.ControlMenu;
import ict.Food.Drink.ChineseDrink;
import ict.Food.Drink.IDrink;
import ict.Food.MainDish.ChineseMainDish;
import ict.Food.MainDish.IMainDish;
import ict.Food.SideDish.ChineseSideDish;
import ict.Food.SideDish.ISideDish;
import ict.FoodMenu.AbstractFoodMenu;
import ict.FoodMenu.ChineseFoodMenu;
import ict.Order.AbstractOrder;
import ict.Order.ChineseOrder;
import ict.TagLib.TagLib;

public class ChineseSetFactory extends AbstractLunchSetFactory {
    private ControlMenu controlMenu;
    private TagLib tagLib;

    public ChineseSetFactory(ControlMenu controlMenu) {
        this.controlMenu = controlMenu;
        this.tagLib = controlMenu.getTagLib();
    }

    @Override
    public AbstractFoodMenu createFoodMenu(IMainDish mainDish, int price, int count) {
        // create Not Set object if mainDish is null;
        if (mainDish == null) {
            mainDish = createMainDish(tagLib.getMsg("tErr06"));
        }
        return new ChineseFoodMenu(controlMenu, mainDish, price, count);
    }

    @Override
    public AbstractOrder createOrder(ISideDish sideDish, IDrink drink, int staffNo, int locationNo) {
        return new ChineseOrder(controlMenu, sideDish, drink, staffNo, locationNo);
    }

    @Override
    public IMainDish createMainDish(String name) {
        return new ChineseMainDish(name);
    }

    @Override
    public IDrink createDrink(String type) {
        String drinkName;
        switch (type) {
            case "h":
                drinkName = tagLib.getMsg("t701") + tagLib.getMsg("t705");
                return new ChineseDrink(drinkName);
            case "i":
                drinkName = tagLib.getMsg("t702") + tagLib.getMsg("t705");
                return new ChineseDrink(drinkName);
            default :
                return null;
        }
    }

    @Override
    public ISideDish createSideDish(String type) {
        String sideDishName = tagLib.getMsg("t310");
        return new ChineseSideDish(sideDishName);
    }

    @Override
    public String getSideDishTypeMsg() {
        return tagLib.getMsg("t310");
    }

    @Override
    public String getDrinkTypeMsg() {
        return tagLib.getMsg("t303");
    }

}
