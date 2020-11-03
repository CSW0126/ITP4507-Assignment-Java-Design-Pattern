package ict.Order;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import ict.ControlMenu;
import ict.Food.Drink.IDrink;
import ict.Food.MainDish.IMainDish;
import ict.Food.SideDish.ISideDish;
import ict.FoodMenu.AbstractFoodMenu;
import ict.Memento.IMemento;
import ict.Memento.OrderMemento;
import ict.TagLib.TagLib;

public class WesternOrder extends AbstractOrder {
    private AbstractFoodMenu westernMenu;
    private TagLib tagLib;
    private IMainDish mainDish;
    private Queue<AbstractOrder> orders;

    public WesternOrder(ControlMenu controlMenu, ISideDish sideDish, IDrink drink, int staffNo, int locationNo) {
        super(controlMenu, sideDish, drink, staffNo, locationNo);
        this.tagLib = controlMenu.getTagLib();
        this.westernMenu = controlMenu.getWesternMenu();
        this.mainDish = westernMenu.getMainDish();
        this.orders = controlMenu.getOrders();
    }

    public WesternOrder(AbstractOrder westernOrder) {
        super(westernOrder.getControlMenu(), westernOrder.getSideDish(), westernOrder.getDrink(),
                westernOrder.getStaffNo(), westernOrder.getLocationNo());
        ControlMenu controlMenu = westernOrder.getControlMenu();
        this.tagLib = controlMenu.getTagLib();
        this.westernMenu = controlMenu.getChineseMenu();
        this.mainDish = westernMenu.getMainDish();
        this.orders = controlMenu.getOrders();
    }

    // Getter Setter
    @Override
    public AbstractFoodMenu getMenu() {
        return westernMenu;
    }

    @Override
    public void setMenu(AbstractFoodMenu westernMenu) {
        this.westernMenu = westernMenu;
    }

    @Override
    public void setMainDish(IMainDish mainDish) {
        this.mainDish = mainDish;
    }

    @Override
    public IMainDish getMainDish() {
        return mainDish;
    }

    // End Getter Setter

    @Override
    public String toString() {
        return tagLib.getMsg("t403") + tagLib.getMsg("t405") + getStaffNo() + " " + tagLib.getMsg("t406")
                + getLocationNo() + " " + mainDish.getMainDishName() + ", " + getSideDish().getSideDishName() + ", "
                + getDrink().getDrinkName();
    }

    @Override
    public IMemento<AbstractOrder> save() {
        return new OrderMemento(new WesternOrder(this));
    }

    @Override
    public void restore(Map<Integer, IMemento<AbstractOrder>> orderMementoMap) {
        Queue<AbstractOrder> newOrders = new LinkedList<>();
        if(!orderMementoMap.isEmpty()){
            for(Map.Entry<Integer, IMemento<AbstractOrder>> memento : orderMementoMap.entrySet()){
                newOrders.add(memento.getValue().getStatus());
            }
            getControlMenu().setOrders(newOrders);
            westernMenu.addCount();
        }else{
            orders.clear();
            tagLib.println("tErr15");
        }
    }

}
