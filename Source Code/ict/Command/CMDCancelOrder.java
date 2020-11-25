package ict.Command;

import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

import ict.ControlMenu;
import ict.Order.AbstractOrder;
import ict.Order.AbstractOrder.OrderMemento;
import ict.TagLib.TagLib;

public class CMDCancelOrder implements ICommand {
    private TagLib tagLib;
    private Scanner sc;
    private Queue<AbstractOrder> orders;
    private Map<Integer, OrderMemento> orderMementoMap;
    private ControlMenu controlMenu;

    public CMDCancelOrder(ControlMenu controlMenu) {
        tagLib = controlMenu.getTagLib();
        sc = controlMenu.getScanner();
        orders = controlMenu.getOrders();
        orderMementoMap = controlMenu.getOrderMementoMap();
        this.controlMenu = controlMenu;
    }

    @Override
    public void execute() {
        if (!orders.isEmpty()) {
            cancelOrder();
        } else {
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
                    controlMenu.removeFromOrderMemento(staffNo);

                    //search in queue
                    for(AbstractOrder order : orders){
                        if(order.getStaffNo() == staffNo){
                            order.restore(orderMementoMap);
                            System.out.println(order.toString());
                            tagLib.println("t503");
                            break;
                        }
                    }
                    break;
                } else {
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
