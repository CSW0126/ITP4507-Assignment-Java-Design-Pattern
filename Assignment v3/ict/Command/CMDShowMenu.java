package ict.Command;

import ict.ControlMenu;
import ict.FoodMenu.FoodMenu;

public class CMDShowMenu implements Command {
	private FoodMenu chineseMenu;
	private FoodMenu westernMenu;

	public CMDShowMenu(ControlMenu controlMenu) {
		chineseMenu = controlMenu.getChineseMenu();
		westernMenu = controlMenu.getWesternMenu();
	}

	@Override
	public void execute() {
		System.out.println(chineseMenu.toString());
		System.out.println(westernMenu.toString());

	}

}
