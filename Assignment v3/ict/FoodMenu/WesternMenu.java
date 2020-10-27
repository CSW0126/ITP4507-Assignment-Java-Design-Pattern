package ict.FoodMenu;

import ict.ControlMenu;
import ict.Food.MainDish.MainDish;
import ict.Memento.Memento;
import ict.Memento.WesternStockMemento;

public class WesternMenu extends FoodMenu {

    public WesternMenu(ControlMenu controlMenu, MainDish mainDish, int price, int count) {
        super(controlMenu, mainDish, price, count);
    }

    @Override
    public String toString() {
        return "\n" + getControlMenu().getTagLib().getMsg("t206") + "\n" + getControlMenu().getTagLib().getMsg("t202")
                + getMainDish().getMainDishName() + "\n" + getControlMenu().getTagLib().getMsg("t207") + "\n"
                + getControlMenu().getTagLib().getMsg("t204") + getPrice() + "\n"
                + getControlMenu().getTagLib().getMsg("t205") + getCount() + "\n";
    }

    @Override
    public Memento<Integer> save() {
        return new WesternStockMemento(this);
    }

    @Override
    public void restore(Memento<Integer> menuMemento) {
        setCount(menuMemento.getStatus());
    }
    
}
