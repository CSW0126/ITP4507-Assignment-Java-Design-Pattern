package ict.Memento;

import java.util.Map;

import ict.Order.Order;

public class Caretaker {
    Memento<Integer> chineseStockMemento;
    Memento<Integer> westernStockMemento;
    Memento<Map<Integer, Order>> ordersMemento;

    public Caretaker() {
    }
    

    public Memento<Integer> getChineseStockMemento() {
        return chineseStockMemento;
    }

    public void setChineseStockMemento(Memento<Integer> chineseStockMemento) {
        this.chineseStockMemento = chineseStockMemento;
    }

    public Memento<Integer> getWesternStockMemento() {
        return westernStockMemento;
    }

    public void setWesternStockMemento(Memento<Integer> westernStockMemento) {
        this.westernStockMemento = westernStockMemento;
    }

    public Memento<Map<Integer, Order>> getOrdersMemento() {
        return ordersMemento;
    }

    public void setOrdersMemento(Memento<Map<Integer, Order>> ordersMemento) {
        this.ordersMemento = ordersMemento;
    }


    

}
