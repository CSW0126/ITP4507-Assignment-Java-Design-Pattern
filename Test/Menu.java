public interface Menu {
    public String getName();

    public void setName(String name);

    public int getCount();

    public void setCount(int count);

    public void add();

    public void min();

    public String toString();

    public Meme<Menu> save();
    public void restore(Meme<Menu> m);
}
