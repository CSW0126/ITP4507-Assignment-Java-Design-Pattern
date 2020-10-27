package ict.FoodMenu;

import ict.ControlMenu;
import ict.Food.MainDish.MainDish;
import ict.Memento.ChineseStockMemento;
import ict.Memento.Memento;

public class ChineseMenu extends FoodMenu {

    public ChineseMenu(ControlMenu controlMenu, MainDish mainDish, int price, int count) {
        super(controlMenu, mainDish, price, count);
    }

    @Override
    public String toString() {
        return "\n" + getControlMenu().getTagLib().getMsg("t201") + "\n" + getControlMenu().getTagLib().getMsg("t202")
                + getMainDish().getMainDishName() + "\n" + getControlMenu().getTagLib().getMsg("t203") + "\n"
                + getControlMenu().getTagLib().getMsg("t204") + getPrice() + "\n"
                + getControlMenu().getTagLib().getMsg("t205") + getCount() + "\n";
    }

    @Override
    public Memento<Integer> save() {
        return new ChineseStockMemento(this);
    }

    @Override
    public void restore(Memento<Integer> menuMemento) {
        setCount(menuMemento.getStatus());
    }

 
}
