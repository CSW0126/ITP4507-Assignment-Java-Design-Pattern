package ict.Command;

import java.util.Queue;

import ict.ControlMenu;
import ict.Order.AbstractOrder;
import ict.TagLib.TagLib;

public class CMDMarkAsDone implements ICommand {
    private Queue<AbstractOrder> orders;
    private Queue<AbstractOrder> doneOrders;
    private TagLib tagLib;
    private ControlMenu controlMenu;

    public CMDMarkAsDone(ControlMenu controlMenu) {
        tagLib = controlMenu.getTagLib();
        doneOrders = controlMenu.getDoneOrders();
        orders = controlMenu.getOrders();
        this.controlMenu = controlMenu;
    }

    @Override
    public void execute() {
        if (!orders.isEmpty()) {
            tagLib.println("t601");
            System.out.println(orders.peek().toString());
            // remove from memento
            controlMenu.removeFromOrderMemento(orders.peek().getStaffNo());
            doneOrders.add(orders.poll());
            tagLib.println("t602");
        } else {
            tagLib.println("t603");
        }

        if(!doneOrders.isEmpty()){
            tagLib.println("t604");
            for(AbstractOrder o : doneOrders){
                System.out.println(o.toString() + "\n");
            }
        }
    }

}
