import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Control {
    private Scanner sc;
    private Queue<Order> orders;
    private Menu m1;
    private Menu m2;
    private ICommand c;
    private Stack<Meme<Menu>> m1Meme;
    private Stack<Meme<Menu>> m2Meme;
    private Stack<Meme<Queue<Order>>> mmOrders;

    public void run() {
        String input = "";

        for (;;) {
            System.out.println("a(add),b(show),c(cancel),sm(showmenu), done(markasdone) ?");
            input = sc.nextLine();
            if (input.equals("a")){
                c = new CMDAddOrder(this);
                c.execute();
            }else if(input.equals("b")){
                c = new ShowCommand(this);
                c.execute();
            }else if(input.equals("c")){
                c = new CMDcancel(this);
                c.execute();
            }else if(input.equals("sm")){
                c = new ShowMenu(this);
                c.execute();
                // System.exit(0);
            }else if(input.equals("done")){
                c = new done(this);
                c.execute();
            }else if(input.equals("pm")){
                System.out.println("M1");
                for(Meme<Menu> m : m1Meme){
                    System.out.println(m.getStatus().toString());
                }
                System.out.println("M2");
                for(Meme<Menu> m : m2Meme){
                    System.out.println(m.getStatus().toString());
                }
                System.out.println("Q");
                for(Order m : orders){
                    System.out.println(m.toString());
                }
            }
        }

    }

    public Control() {
        sc = new Scanner(System.in);
        orders = new LinkedList<Order>();
        m1 = new M1("M1", 10);
        m2 = new M2("M2", 10);
        m1Meme = new Stack<Meme<Menu>>();
        m2Meme = new Stack<Meme<Menu>>();
        mmOrders = new Stack<Meme<Queue<Order>>>();
    }

    


    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public Queue<Order> getOrders() {
        return orders;
    }

    public void setOrders(Queue<Order> orders) {
        this.orders = orders;
    }

    public Menu getM1() {
        return m1;
    }

    public void setM1(Menu m1) {
        this.m1 = m1;
    }

    public Menu getM2() {
        return m2;
    }

    public void setM2(Menu m2) {
        this.m2 = m2;
    }

    public ICommand getC() {
        return c;
    }

    public void setC(ICommand c) {
        this.c = c;
    }

    public Stack<Meme<Menu>> getM1Meme() {
        return m1Meme;
    }

    public void setM1Meme(Stack<Meme<Menu>> m1Meme) {
        this.m1Meme = m1Meme;
    }

    public Stack<Meme<Menu>> getM2Meme() {
        return m2Meme;
    }

    public void setM2Meme(Stack<Meme<Menu>> m2Meme) {
        this.m2Meme = m2Meme;
    }

    public Stack<Meme<Queue<Order>>> getMmOrders() {
        return mmOrders;
    }

    public void setMmOrders(Stack<Meme<Queue<Order>>> mmOrders) {
        this.mmOrders = mmOrders;
    }

    
}
