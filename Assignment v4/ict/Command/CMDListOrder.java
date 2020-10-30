package ict.Command;

import java.util.Queue;

import ict.ControlMenu;
import ict.Order.AbstractOrder;
import ict.TagLib.TagLib;

public class CMDListOrder implements ICommand {
    private TagLib tagLib;
    private Queue<AbstractOrder> orders;

    public CMDListOrder(ControlMenu controlMenu) {
        tagLib = controlMenu.getTagLib();
    }

    @Override
    public void execute() {
        if (!orders.isEmpty()) {
            for (AbstractOrder order : orders) {
               System.out.println(order.toString() + "\n");
            }
        } else {
            tagLib.println("tErr12");
        }
    }

}
