package ict.Memento;

import ict.FoodMenu.FoodMenu;

public class WesternStockMemento implements Memento<Integer>{
    private FoodMenu westernMenu;

    public WesternStockMemento(FoodMenu westernMenu) {
        this.westernMenu = westernMenu;
    }

    @Override
    public Integer getStatus() {
        return westernMenu.getCount();
    }

    @Override
    public void setStatus(Integer count) {
        westernMenu.setCount(count);

    }
    
}
