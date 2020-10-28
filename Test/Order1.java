import java.util.Stack;

public class Order1 implements Order {
    private int id;
    private String name;
    private String type;
    private Stack<Meme<Menu>> m1Meme;
    private Menu m;


    public Order1(int id, String name ,Stack<Meme<Menu>> mm, Menu m ) {
        this.id = id;
        this.name = name;
        type = "O1";
        m1Meme =  mm;
        this.m = m;
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

    @Override
    public String toString() {
        return "Order1 [id=" + id + ", name=" + name + "]";
    }

    public String getType() {
        return type;
    }

    public Stack<Meme<Menu>> getMeme() {
        return m1Meme;
    }

    public Menu getM() {
        return m;
    }
}
