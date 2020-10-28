package ict.FoodMenu;

import ict.ControlMenu;
import ict.Food.MainDish.IMainDish;

public abstract class AbstractFoodMenu {
    private ControlMenu controlMenu;
    private IMainDish mainDish;
    private int price;
    private int count;

    public AbstractFoodMenu(ControlMenu controlMenu, IMainDish mainDish, int price, int count) {
        this.controlMenu = controlMenu;
        this.mainDish = mainDish;
        this.price = price;
        this.count = count;
    }

    public void addCount(){
        count ++;
    }

    public void subtractCount(){
        count --;
        if(count < 0){
            count = 0;
        }
    }

    //Getter Setter
    public ControlMenu getControlMenu() {
        return controlMenu;
    }

    public IMainDish getMainDish() {
        return mainDish;
    }

    public void setMainDish(IMainDish mainDish) {
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

    //abstract Method
    // public abstract IMemento save();
    // public abstract void restore(IMemento memento);
    public abstract String toString();

    

    

}
