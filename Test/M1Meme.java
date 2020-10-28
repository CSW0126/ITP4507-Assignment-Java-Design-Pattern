public class M1Meme implements Meme<Menu>{
    Menu m1;

    @Override
    public Menu getStatus() {
        return m1;
    }

    @Override
    public void setStatus(Menu menu) {
        this.m1 = menu;
    }

    public M1Meme(Menu m1) {
        this.m1 = m1;
    }

    

    
}
