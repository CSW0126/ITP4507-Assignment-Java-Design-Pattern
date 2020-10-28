import java.util.Stack;

public interface Order {
    public int getId();

    public void setId(int id);

    public String getName();

    public void setName(String name);
    public String toString();
    public String getType();
    public Stack<Meme<Menu>> getMeme();
    public Menu getM();

}
