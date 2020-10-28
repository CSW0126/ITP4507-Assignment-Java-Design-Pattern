public class M2Meme implements Meme<Menu>{
    private Menu m2;

    @Override
    public Menu getStatus() {
        return m2;
    }

    @Override
    public void setStatus(Menu menu) {
        this.m2 = menu;
    }

    public M2Meme(Menu m2) {
        this.m2 = m2;
    }




    
}
