import java.util.Stack;

public class Order2 implements Order {
    private int id;
    private String name;
    private String type;
    private Stack<Meme<Menu>> m2Meme;
    private Menu m;

    public Order2(int id, String name, Stack<Meme<Menu>> mm, Menu m) {
        this.id = id;
        this.name = name;
        type = "O2";
        m2Meme = mm;
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
        return "Order2 [id=" + id + ", name=" + name + "]";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public Stack<Meme<Menu>> getMeme() {
        return m2Meme;
    }

    public Menu getM() {
        return m;
    }
}
