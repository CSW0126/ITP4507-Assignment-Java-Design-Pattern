import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CMDcancel implements ICommand {
    private Control c;
    private Scanner sc;

    public CMDcancel(Control c) {
        this.c = c;
        this.sc = c.getSc();
    }

    @Override
    public void execute() {
        int input = 0;

        System.out.println("ID?");

        input = sc.nextInt();

        Queue<Order> s = c.getMmOrders().pop().getStatus();
        Queue<Order> newQ = new LinkedList<Order>();
        for (Order o : s) {
            if (o.getId() == input) {

                o.getM().restore(o.getMeme().pop());

            } else {
                newQ.add(o);
            }
        }

        c.setOrders(newQ);

        c.getMmOrders().add(new MemeOrders(newQ));

    }

}
