public class M2 implements Menu{
    private String name;
    private int count;


    
    @Override
    public String toString() {
        return "M2 [count=" + count + ", name=" + name + "]";
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

    public M2(String name, int count) {
        this.name = name;
        this.count = count;
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

    public M2(Menu m){
        this.name = m.getName();
        this.count = m.getCount();
    }

    @Override
    public Meme<Menu> save() {
        return new M2Meme(this);
    }

    @Override
    public void restore(Meme<Menu> m) {
        this.count = m.getStatus().getCount();
    }
}
