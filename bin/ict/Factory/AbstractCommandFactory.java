package ict.Factory;

import ict.Command.ICommand;

public abstract class AbstractCommandFactory {
    public abstract ICommand getCommand(String command);

}
