public class done implements ICommand{
    private Control c ;

    public done(Control c){
        this.c = c;
    }
    @Override
    public void execute() {
        System.out.println(c.getOrders().poll().toString()+ "removed");
    }
    
}
