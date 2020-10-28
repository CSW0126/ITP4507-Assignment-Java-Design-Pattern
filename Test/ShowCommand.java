public class ShowCommand implements ICommand{
    private Control c ;

    public ShowCommand(Control c){
        this.c = c;
    }
    @Override
    public void execute() {
        for(Order s : c.getOrders()){
            System.out.println(s.toString());
        }
    }
    
}
