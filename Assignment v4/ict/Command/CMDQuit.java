package ict.Command;

import ict.ControlMenu;
import ict.TagLib.TagLib;

public class CMDQuit implements ICommand {
    private TagLib tagLib;

    public CMDQuit(ControlMenu controlMenu) {
        tagLib = controlMenu.getTagLib();
    }

    @Override
    public void execute() {
        tagLib.println("t003");
        System.exit(0);
    }

}
