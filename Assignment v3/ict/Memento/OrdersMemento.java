package ict.Memento;

import java.util.Map;

import ict.Order.Order;

public class OrdersMemento implements Memento<Map<Integer, Order>>{
    private Map<Integer, Order> orders;

    public OrdersMemento(Map<Integer, Order> orders) {
        this.orders = orders;
    }


    @Override
    public Map<Integer, Order> getStatus() {
        return orders;
    }

    @Override
    public void setStatus(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    
}
