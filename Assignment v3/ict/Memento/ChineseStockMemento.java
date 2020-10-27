package ict.Memento;

import ict.FoodMenu.FoodMenu;

public class ChineseStockMemento implements Memento<Integer>{
    private FoodMenu foodMenu;

    public ChineseStockMemento(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    @Override
    public Integer getStatus() {
        return foodMenu.getCount();
    }

    @Override
    public void setStatus(Integer count) {
        foodMenu.setCount(count);
    }

 
    
}
