package ict.Factory;

import ict.ControlMenu;
import ict.Command.CMDCancelOrder;
import ict.Command.CMDEditMenu;
import ict.Command.CMDListOrder;
import ict.Command.CMDMarkAsDone;
import ict.Command.CMDPlaceOrder;
import ict.Command.CMDQuit;
import ict.Command.CMDShowMenu;
import ict.Command.ICommand;

public class CommandFactory extends AbstractCommandFactory {
    private ControlMenu controlMenu;

    public CommandFactory(ControlMenu controlMenu) {
        this.controlMenu = controlMenu;
    }

    @Override
    public ICommand getCommand(String command) {
        switch (command) {
            case "e":
                return new CMDEditMenu(controlMenu);
            case "s":
                return new CMDShowMenu(controlMenu);
            case "p":
                return new CMDPlaceOrder(controlMenu);
            case "c":
                return new CMDCancelOrder(controlMenu);
            case "l":
                return new CMDListOrder(controlMenu);
            case "d":
                return new CMDMarkAsDone(controlMenu);
            case "q":
                return new CMDQuit(controlMenu);
            default:
                return null;
        }
    }

}
