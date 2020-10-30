package ict.Factory;

import ict.ControlMenu;
import ict.Food.Drink.IDrink;
import ict.Food.Drink.WesternDrink;
import ict.Food.MainDish.IMainDish;
import ict.Food.MainDish.WesternMainDish;
import ict.Food.SideDish.ISideDish;
import ict.Food.SideDish.WesternDideDish;
import ict.FoodMenu.AbstractFoodMenu;
import ict.FoodMenu.WesternFoodMenu;
import ict.Order.AbstractOrder;
import ict.Order.WesternOrder;
import ict.TagLib.TagLib;

public class WesternSetFactory extends AbstractLunchSetFactory {
    private ControlMenu controlMenu;
    private TagLib tagLib;

    public WesternSetFactory(ControlMenu controlMenu) {
        this.controlMenu = controlMenu;
        tagLib = controlMenu.getTagLib();
    }

    @Override
    public AbstractFoodMenu createFoodMenu(IMainDish mainDish, int price, int count) {
        // create Not Set object if mainDish is null;
        if (mainDish == null) {
            mainDish = createMainDish(tagLib.getMsg("tErr06"));
        }
        return new WesternFoodMenu(controlMenu, mainDish, price, count);
    }

    @Override
    public AbstractOrder createOrder(ISideDish sideDish, IDrink drink, int staffNo, int locationNo) {
        return new WesternOrder(controlMenu, sideDish, drink, staffNo, locationNo);
    }

    @Override
    public IMainDish createMainDish(String name) {
        return new WesternMainDish(name);
    }

    @Override
    public IDrink createDrink(String type) {
        String drinkName;
        switch (type) {
            case "ht":
                drinkName = tagLib.getMsg("t701") + tagLib.getMsg("t703");
                return new WesternDrink(drinkName);
            case "it":
                drinkName = tagLib.getMsg("t702") + tagLib.getMsg("t703");
                return new WesternDrink(drinkName);
            case "hc":
                drinkName = tagLib.getMsg("t701") + tagLib.getMsg("t704");
                return new WesternDrink(drinkName);
            case "ic":
                drinkName = tagLib.getMsg("t702") + tagLib.getMsg("t704");
                return new WesternDrink(drinkName);
            default:
                return null;
        }
    }

    @Override
    public ISideDish createSideDish(String type) {
        String sideDishName = "";
        switch (type) {
            case "r":
                sideDishName = tagLib.getMsg("t311");
                return new WesternDideDish(sideDishName);
            case "s":
                sideDishName = tagLib.getMsg("t312");
                return new WesternDideDish(sideDishName);
            case "f":
                sideDishName = tagLib.getMsg("t313");
                return new WesternDideDish(sideDishName);
            default:
                return null;
        }
    }

    @Override
    public String getSideDishTypeMsg() {
        return tagLib.getMsg("t307");
    }

    @Override
    public String getDrinkTypeMsg() {
        return tagLib.getMsg("t308");
    }

}
