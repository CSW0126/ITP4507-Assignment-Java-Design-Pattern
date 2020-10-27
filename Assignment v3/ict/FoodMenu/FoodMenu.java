package ict.FoodMenu;

import ict.ControlMenu;
import ict.Food.MainDish.MainDish;
import ict.Memento.Memento;

public abstract class FoodMenu {
    private ControlMenu controlMenu;
    private MainDish mainDish;
    private int price;
    private int count;

    public FoodMenu(ControlMenu controlMenu, MainDish mainDish, int price, int count) {
        this.controlMenu = controlMenu;
        this.mainDish = mainDish;
        this.price = price;
        this.count = count;
    }

    public void addCount(){
        count ++;
    }

    public void minusCount(){
        count --;
        if(count < 0){
            count = 0;
        }
    }

    // Getter , Setter
    public ControlMenu getControlMenu() {
        return controlMenu;
    }

    public MainDish getMainDish() {
        return mainDish;
    }

    public void setMainDish(MainDish mainDish) {
        this.mainDish = mainDish;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    // End Getter , Setter

    // abstract Method
    public abstract String toString();
    public abstract Memento<Integer> save();
    public abstract void restore(Memento<Integer> menuMemento);


}
