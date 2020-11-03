package ict.Command;

import java.util.ArrayList;
import java.util.List;

import ict.ControlMenu;
import ict.FoodMenu.AbstractFoodMenu;
import ict.TagLib.TagLib;

public class CMDShowMenu implements ICommand {
    private List<AbstractFoodMenu> menuList;
    private AbstractFoodMenu chineseMenu;
    private AbstractFoodMenu westernMenu;
    private TagLib tagLib;

    public CMDShowMenu(ControlMenu controlMenu) {
        menuList = new ArrayList<>();
        tagLib = controlMenu.getTagLib();
        chineseMenu = controlMenu.getChineseMenu();
        westernMenu = controlMenu.getWesternMenu();

        // add menu to list
        menuList.add(chineseMenu);
        menuList.add(westernMenu);

    }

    @Override
    public void execute() {
        // print all
        tagLib.println("t401");
        for (AbstractFoodMenu menu : menuList) {
            System.out.println(menu.toString());
        }
        System.out.println();
    }
}
