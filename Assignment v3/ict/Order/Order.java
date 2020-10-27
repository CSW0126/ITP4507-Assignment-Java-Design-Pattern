package ict.Order;


import ict.ControlMenu;
import ict.Food.Drink.Drink;
import ict.Food.MainDish.MainDish;
import ict.Food.SideDish.SideDish;

public abstract class Order {
    private ControlMenu controlMenu;
    private MainDish mainDish;
    private SideDish sideDish;
    private Drink drink;
    private int staffNo;
    private int locationNo;

    public Order(ControlMenu controlMenu, MainDish mainDish, SideDish sideDish, Drink drink, int staffNo, int locationNo) {
        this.controlMenu = controlMenu;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.drink = drink;
        this.staffNo = staffNo;
        this.locationNo = locationNo;
    }

    //Getter , Setter
    public ControlMenu getControlMenu() {
        return controlMenu;
    }

    public MainDish getMainDish() {
        return mainDish;
    }

    public void setMainDish(MainDish mainDish) {
        this.mainDish = mainDish;
    }

    public SideDish getSideDish() {
        return sideDish;
    }

    public void setSideDish(SideDish sideDish) {
        this.sideDish = sideDish;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
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

    //End Getter , Setter

    public abstract String toString();
    // public abstract Memento<Map<Integer,Order>> save();
    // public abstract void restore(Memento<Map<Integer, Order>> ordersMemento);

}
