package ict.Memento;

import ict.Order.AbstractOrder;

public class OrderMemento implements IMemento<AbstractOrder> {
    private AbstractOrder order;

    public OrderMemento(AbstractOrder order){
        this.order = order;
    } 


    @Override
    public void setStatus(AbstractOrder order) {
        this.order = order;
    }

    @Override
    public AbstractOrder getStatus() {
        return order;
    }
    
}
