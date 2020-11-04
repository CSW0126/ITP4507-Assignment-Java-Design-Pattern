package ict.Factory;

import ict.Food.Drink.IDrink;
import ict.Food.MainDish.IMainDish;
import ict.Food.SideDish.ISideDish;
import ict.FoodMenu.AbstractFoodMenu;
import ict.Order.AbstractOrder;

public abstract class AbstractLunchSetFactory {
    // abstract Method
    public abstract AbstractFoodMenu createFoodMenu(IMainDish mainDish, int price, int count);

    public abstract AbstractOrder createOrder(ISideDish sideDish, IDrink drink, int staffNo, int locationNo);

    public abstract IMainDish createMainDish(String name);

    public abstract IDrink createDrink(String type);

    public abstract ISideDish createSideDish(String type);

    public abstract String getSideDishTypeMsg();

    public abstract String getDrinkTypeMsg();
}
