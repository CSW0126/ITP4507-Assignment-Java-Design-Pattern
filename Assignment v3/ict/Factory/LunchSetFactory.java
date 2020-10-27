package ict.Factory;

import ict.FoodMenu.*;
import ict.Order.*;
import ict.ControlMenu;
import ict.Food.Drink.*;
import ict.Food.MainDish.*;
import ict.Food.SideDish.*;

public abstract class LunchSetFactory {
    //abstract Method
    public abstract FoodMenu createFoodMenu(ControlMenu controlMenu, MainDish mainDish, int price, int count);
    public abstract Order createOrder(ControlMenu controlMenu, MainDish mainDish, SideDish sideDish, Drink drink, int staffNo, int locationNo);
    public abstract MainDish createMainDish(ControlMenu controlMenu, String mainDishName);
    public abstract SideDish createSideDish(ControlMenu controlMenu, String sideDishName);
    public abstract Drink createDrink(ControlMenu controlMenu, String drinkName);

}
