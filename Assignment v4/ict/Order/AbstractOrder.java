package ict.Order;

import java.util.Map;

import ict.ControlMenu;
import ict.Food.Drink.IDrink;
import ict.Food.MainDish.IMainDish;
import ict.Food.SideDish.ISideDish;
import ict.FoodMenu.AbstractFoodMenu;
import ict.Memento.IMemento;

public abstract class AbstractOrder {
    private ControlMenu controlMenu;
    private ISideDish sideDish;
    private IDrink drink;
    private int staffNo;
    private int locationNo;

    public AbstractOrder(ControlMenu controlMenu, ISideDish sideDish, IDrink drink, int staffNo,
            int locationNo) {
        this.controlMenu = controlMenu;
        this.sideDish = sideDish;
        this.drink = drink;
        this.staffNo = staffNo;
        this.locationNo = locationNo;
    }

    // Getter, setter

    public ControlMenu getControlMenu() {
        return controlMenu;
    }

    public void setControlMenu(ControlMenu controlMenu) {
        this.controlMenu = controlMenu;
    }

    public ISideDish getSideDish() {
        return sideDish;
    }

    public void setSideDish(ISideDish sideDish) {
        this.sideDish = sideDish;
    }

    public IDrink getDrink() {
        return drink;
    }

    public void setDrink(IDrink drink) {
        this.drink = drink;
    }

    public int getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(int staffNo) {
        this.staffNo = staffNo;
    }

    public int getLocationNo() {
        return locationNo;
    }

    public void setLocationNo(int locationNo) {
        this.locationNo = locationNo;
    }

    // End Getter, setter

    // abstract method
    public abstract String toString();
    public abstract void setMainDish(IMainDish mainDish);
    public abstract IMainDish getMainDish();
    public abstract AbstractFoodMenu getMenu();
    public abstract void setMenu(AbstractFoodMenu menu);
    public abstract IMemento<AbstractOrder> save();
    public abstract void restore(Map<Integer, IMemento<AbstractOrder>> orderMementoMap);

}
