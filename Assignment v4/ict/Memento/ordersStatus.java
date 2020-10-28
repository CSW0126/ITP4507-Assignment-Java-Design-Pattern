package ict.Memento;

import java.util.Queue;

import ict.Order.AbstractOrder;

public class ordersStatus implements IMemento<Queue<AbstractOrder>> {

    @Override
    public void setStatus(Queue<AbstractOrder> object) {

    }

    @Override
    public Queue<AbstractOrder> getStatus() {
        return null;
    }
    
}
