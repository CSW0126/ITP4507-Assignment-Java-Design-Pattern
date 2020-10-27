package ict.Factory;

import ict.ControlMenu;
import ict.Food.Drink.Drink;
import ict.Food.Drink.WesternDrink;
import ict.Food.MainDish.MainDish;
import ict.Food.MainDish.WesternMainDish;
import ict.Food.SideDish.SideDish;
import ict.Food.SideDish.WesternSideDish;
import ict.FoodMenu.FoodMenu;
import ict.FoodMenu.WesternMenu;
import ict.Order.Order;
import ict.Order.WesternOrder;

public class WesternSetFactory extends LunchSetFactory {

    @Override
    public FoodMenu createFoodMenu(ControlMenu controlMenu, MainDish mainDish, int price, int count) {
        return new WesternMenu(controlMenu, mainDish, price, count);
    }

    @Override
    public Order createOrder(ControlMenu controlMenu, MainDish mainDish, SideDish sideDish, Drink drink, int staffNo, int locationNo) {
        return new WesternOrder(controlMenu, mainDish, sideDish, drink, staffNo, locationNo);
    }

    @Override
    public MainDish createMainDish(ControlMenu controlMenu, String mainDishName) {
        return new WesternMainDish(controlMenu, mainDishName);
    }

    @Override
    public SideDish createSideDish(ControlMenu controlMenu, String sideDishName) {
        return new WesternSideDish(controlMenu, sideDishName);
    }

    @Override
    public Drink createDrink(ControlMenu controlMenu, String drinkName) {
        return new WesternDrink(controlMenu, drinkName);
    }
    
}
