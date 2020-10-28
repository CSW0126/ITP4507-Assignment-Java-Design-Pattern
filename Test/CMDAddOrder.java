import java.util.Scanner;

public class CMDAddOrder implements ICommand {

    private Control c;
    private Scanner sc;

    public CMDAddOrder(Control c) {
        this.c = c;
        sc = c.getSc();
    }

    @Override
    public void execute() {
        String input = "";

        System.out.println("M1 ? M2");

        input = sc.nextLine();
        if (input.equals("M1")) {
            System.out.println("ID?");
            int in = sc.nextInt();
            c.getOrders().add(new Order1(in, "M1O", c.getM1Meme(), c.getM1()));
            c.getM1Meme().push(new M1Meme(new M1(c.getM1())));
            c.getM1().min();

            c.getMmOrders().add(new MemeOrders(c.getOrders()));
            
        } else if (input.equals("M2")) {
            System.out.println("ID?");
            int in = sc.nextInt();
            c.getOrders().add(new Order2(in, "M2O", c.getM2Meme(), c.getM2()));
            c.getM2Meme().push(new M2Meme(new M2(c.getM2())));
            c.getM2().min();
            c.getMmOrders().add(new MemeOrders(c.getOrders()));
        }
    }

}
