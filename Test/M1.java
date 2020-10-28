public class M1 implements Menu{
    private String name;
    private int count;


    
    @Override
    public String toString() {
        return "M1 [count=" + count + ", name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public M1(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public M1(Menu m){
        this.name = m.getName();
        this.count = m.getCount();
    }

    public void add(){
        count ++;
    }

    public void min(){
        count --;
        if (count < 0){
            count =0;
        };
    }

    @Override
    public Meme<Menu> save() {
        return new M1Meme(this);
    }

    @Override
    public void restore(Meme<Menu> m) {
        this.count = m.getStatus().getCount();
    }

    
}
