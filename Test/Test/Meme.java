package Test;

public class Meme {
    private Order order;
    private int id;
    private String name;

    public Meme(Order order) {
        this.order = order;
        this.id = order.getId();
        this.name = order.getName();
    }

    public Order getStatus() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
