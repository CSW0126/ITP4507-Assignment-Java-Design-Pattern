package ict.Factory;

import ict.ControlMenu;
import ict.Food.Drink.ChineseDrink;
import ict.Food.Drink.Drink;
import ict.Food.MainDish.ChineseMainDish;
import ict.Food.MainDish.MainDish;
import ict.Food.SideDish.ChineseSideDish;
import ict.Food.SideDish.SideDish;
import ict.FoodMenu.ChineseMenu;
import ict.FoodMenu.FoodMenu;
import ict.Order.ChineseOrder;
import ict.Order.Order;

public class ChineseSetFactory extends LunchSetFactory {

    @Override
    public FoodMenu createFoodMenu(ControlMenu controlMenu, MainDish mainDish, int price, int count) {
        return new ChineseMenu(controlMenu, mainDish, price, count);
    }

    @Override
    public Order createOrder(ControlMenu controlMenu, MainDish mainDish, SideDish sideDish, Drink drink, int staffNo, int locationNo) {
        return new ChineseOrder(controlMenu, mainDish, sideDish, drink, staffNo, locationNo);
    }

    @Override
    public MainDish createMainDish(ControlMenu controlMenu, String mainDishName) {
        return new ChineseMainDish(controlMenu, mainDishName);
    }

    @Override
    public SideDish createSideDish(ControlMenu controlMenu, String sideDishName) {
        return new ChineseSideDish(controlMenu, sideDishName);
    }

    @Override
    public Drink createDrink(ControlMenu controlMenu, String drinkName) {
        return new ChineseDrink(controlMenu, drinkName);
    }
    
}
