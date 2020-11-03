package ict.Command;

import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

import ict.CareTaker;
import ict.ControlMenu;
import ict.Memento.IMemento;
import ict.Order.AbstractOrder;
import ict.TagLib.TagLib;

public class CMDCancelOrder implements ICommand {
    private TagLib tagLib;
    private CareTaker careTaker;
    private Scanner sc;
    private Queue<AbstractOrder> orders;
    private Map<Integer, IMemento<AbstractOrder>> orderMementoMap;

    public CMDCancelOrder(ControlMenu controlMenu) {
        tagLib = controlMenu.getTagLib();
        careTaker = controlMenu.getCareTaker();
        sc = controlMenu.getScanner();
        orders = controlMenu.getOrders();
        orderMementoMap = careTaker.getOrderMementoMap();
    }

    @Override
    public void execute() {
        if(!orders.isEmpty()){
            cancelOrder();
        }else{
            tagLib.println("tErr16");
        }

    }

    private void cancelOrder() {
        String input = "";
        int staffNo;
        // print header
        tagLib.println("t501");

        for (;;) {
            tagLib.print("t405");

            try {
                input = sc.nextLine();
                staffNo = Integer.parseInt(input);

                // check exist order
                if (isExistOrder(staffNo)) {
                    AbstractOrder removedOrder;
                    removedOrder = careTaker.removeFromOrderMemento(staffNo);
                    removedOrder.restore(orderMementoMap);
                    System.out.println(removedOrder.toString());
                    tagLib.println("t503");
                    break;
                }else{
                    tagLib.println("tErr17");
                }

            } catch (Exception ex) {
                tagLib.println("tErr08");
            }

        }
    }

    private boolean isExistOrder(int staffNo) {
        for (AbstractOrder o : orders) {
            if (o.getStaffNo() == staffNo) {
                return true;
            }
        }
        return false;
    }

}
