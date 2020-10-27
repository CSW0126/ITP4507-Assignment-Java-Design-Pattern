package ict.Order;


import ict.ControlMenu;
import ict.Food.Drink.Drink;
import ict.Food.MainDish.MainDish;
import ict.Food.SideDish.SideDish;


public class WesternOrder extends Order {

    public WesternOrder(ControlMenu controlMenu, MainDish mainDish, SideDish sideDish, Drink drink, int staffNo,
            int locationNo) {
        super(controlMenu, mainDish, sideDish, drink, staffNo, locationNo);
    }

    @Override
    public String toString() {
        return getControlMenu().getTagLib().getMsg("t402") + getControlMenu().getTagLib().getMsg("t405") + getStaffNo()
                + " " + getControlMenu().getTagLib().getMsg("t406") + getLocationNo() + " "
                + getMainDish().getMainDishName() + ", " + getSideDish().getSideDishName() + ", "
                + getDrink().getDrinkName();
    }

    // @Override
    // public Memento<Map<Integer, Order>> save() {
    //     return new OrdersMemento(getControlMenu().getOrders());
    // }

    // @Override
    // public void restore(Memento<Map<Integer, Order>> orderMemento) {
    //     getControlMenu().setOrders(orderMemento.getStatus());

    // }
    
}
