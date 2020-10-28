public class ShowMenu implements ICommand {
    private Control c;


    @Override
    public void execute() {
        System.out.println(c.getM1().toString());
        System.out.println(c.getM2().toString());
    }

    public ShowMenu(Control c) {
        this.c = c;
    }
    
}
