import java.util.Queue;

public class MemeOrders implements Meme<Queue<Order>> {
    Queue<Order> orders;


    @Override
    public Queue<Order> getStatus() {
        return orders;
    }

    @Override
    public void setStatus(Queue<Order> orders) {
        this.orders = orders;

    }

    public Queue<Order> getOrders() {
        return orders;
    }

    public void setOrders(Queue<Order> orders) {
        this.orders = orders;
    }

    public MemeOrders(Queue<Order> orders) {
        this.orders = orders;
    }
    
}
