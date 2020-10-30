package Test;

public class Order {
    private String name;
    private int id;


    
    public Meme save(){
        return new Meme(this);
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
