package ict;

import java.util.LinkedHashMap;
import java.util.Map;

import ict.Memento.IMemento;
import ict.Order.AbstractOrder;

public class CareTaker {
    private Map<Integer, IMemento<AbstractOrder>> orderMementoMap; 

    public CareTaker(){
        orderMementoMap = new LinkedHashMap<>();
    }

    public Map<Integer, IMemento<AbstractOrder>> getOrderMementoMap() {
        return orderMementoMap;
    }

    public void addOrderMemento(IMemento<AbstractOrder> orderMemento){
        int staffNo = orderMemento.getStatus().getStaffNo();
        orderMementoMap.put(staffNo, orderMemento);
    }

    public AbstractOrder removeFromOrderMemento(int staffNo){
        AbstractOrder removedOrder;
        removedOrder = orderMementoMap.get(staffNo).getStatus();
        orderMementoMap.remove(staffNo);
        return removedOrder;
    }
    
}
