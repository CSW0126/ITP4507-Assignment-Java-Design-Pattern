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

public class ChineseOrder extends AbstractOrder {
    private AbstractFoodMenu chineseMenu;
    private IMainDish mainDish;
    private TagLib tagLib;
    private Queue<AbstractOrder> orders;

    public ChineseOrder(ControlMenu controlMenu, ISideDish sideDish, IDrink drink, int staffNo, int locationNo) {
        super(controlMenu, sideDish, drink, staffNo, locationNo);
        this.tagLib = controlMenu.getTagLib();
        this.chineseMenu = controlMenu.getChineseMenu();
        this.mainDish = chineseMenu.getMainDish();
        this.orders = controlMenu.getOrders();
    }

    public ChineseOrder(AbstractOrder chineseOrder) {
        super(chineseOrder.getControlMenu(), chineseOrder.getSideDish(), chineseOrder.getDrink(),
                chineseOrder.getStaffNo(), chineseOrder.getLocationNo());
        ControlMenu controlMenu = chineseOrder.getControlMenu();
        this.tagLib = controlMenu.getTagLib();
        this.chineseMenu = controlMenu.getChineseMenu();
        this.mainDish = chineseMenu.getMainDish();
        this.orders = controlMenu.getOrders();
    }

    // Getter Setter
    @Override
    public AbstractFoodMenu getMenu() {
        return chineseMenu;
    }

    @Override
    public void setMenu(AbstractFoodMenu chineseMenu) {
        this.chineseMenu = chineseMenu;
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
        return tagLib.getMsg("t402") + tagLib.getMsg("t405") + getStaffNo() + " " + tagLib.getMsg("t406")
                + getLocationNo() + " " + mainDish.getMainDishName() + ", " + getSideDish().getSideDishName() + ", "
                + getDrink().getDrinkName();
    }

    @Override
    public IMemento<AbstractOrder> save() {
        return new OrderMemento(new ChineseOrder(this));
    }

    @Override
    public void restore(Map<Integer, IMemento<AbstractOrder>> orderMementoMap) {
        Queue<AbstractOrder> newOrders = new LinkedList<>();
        if(!orderMementoMap.isEmpty()){
            for(Map.Entry<Integer, IMemento<AbstractOrder>> memento : orderMementoMap.entrySet()){
                newOrders.add(memento.getValue().getStatus());
            }
            getControlMenu().setOrders(newOrders);
            chineseMenu.addCount();
        }else{
            orders.clear();
            tagLib.println("tErr15");
        }
    }

}
