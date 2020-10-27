package ict.Command;

import ict.ControlMenu;
import ict.Food.MainDish.MainDish;
import ict.FoodMenu.FoodMenu;

public class CMDEditMenu implements Command {
	private ControlMenu controlMenu;
	private FoodMenu chineseMenu;
	private FoodMenu westernMenu;

	public CMDEditMenu(ControlMenu controlMenu) {
		this.controlMenu = controlMenu;
		chineseMenu = controlMenu.getChineseMenu();
		westernMenu = controlMenu.getWesternMenu();
	}

	@Override
	public void execute() {
		// actions
		printConsoleMenu();

		// end command message
		controlMenu.getTagLib().println("t105");
		System.out.println();
	}

	// other method
	private void printConsoleMenu() {
		// var
		boolean keepRunning = true;
		String input = "";
		MainDish mainDish;
		int price;
		int count;

		// print header
		controlMenu.getTagLib().println("t101");

		// loop, ask for type
		while (keepRunning) {
			controlMenu.getTagLib().print("t102");

			input = controlMenu.getScanner().nextLine();
			// switch
			switch (input) {
				case "c":
					// if c, edit chinese food set
					// get MainDish , price , count from input
					mainDish = controlMenu.getChineseFactory().createMainDish(controlMenu, getMainDishInput());
					price = getPriceInput();
					count = getCountInput();

					// set MainDish , price , count
					setMenu(chineseMenu, mainDish, price, count);

					// end loop
					keepRunning = false;
					break;
				case "w":
					// if w, edit western food set
					// get MainDish , price , count from input
					mainDish = controlMenu.getWesternFactory().createMainDish(controlMenu, getMainDishInput());
					price = getPriceInput();
					count = getCountInput();
					// set name , price , count
					setMenu(westernMenu, mainDish, price, count);

					// end loop
					keepRunning = false;
					break;
				default:
					controlMenu.getTagLib().println("tErr07");
			}
		}
	}

	private void setMenu(FoodMenu foodMenu, MainDish mainDish, int price, int count) {
		foodMenu.setMainDish(mainDish);
		foodMenu.setPrice(price);
		foodMenu.setCount(count);
	}

	private String getMainDishInput() {
		// var
		boolean keepRunning = true;
		String dishName = "";

		// loop for get dishName
		while (keepRunning) {
			try {
				controlMenu.getTagLib().print("t103");

				dishName = controlMenu.getScanner().nextLine();
				// if not blank , end running, then return value
				if (!dishName.isBlank()) {
					keepRunning = false;
				} else {
					controlMenu.getTagLib().println("tErr10");
				}
			} catch (Exception ex) {
				controlMenu.getTagLib().println("tErr10");
				controlMenu.getScanner().next();
			}

		}
		return dishName;

	}

	private int getPriceInput() {
		// var
		boolean keepRunning = true;
		String input = "";
		int price = 0;

		// lopp for get price
		while (keepRunning) {
			try {
				controlMenu.getTagLib().print("t104");
				input = controlMenu.getScanner().nextLine();
				price = Integer.parseInt(input);

				//check if price < 0
				if(price > 0){
					keepRunning = false;	
				}else{
					controlMenu.getTagLib().println("tErr09");
				}

			} catch (Exception ex) {
				controlMenu.getTagLib().print("tErr08");
			}
		}
		return price;
	}

	private int getCountInput() {
		// var
		boolean keepRunning = true;
		int count = 0;
		String input = "";

		// loop for get count
		while (keepRunning) {
			try {
				controlMenu.getTagLib().print("t205");
				input = controlMenu.getScanner().nextLine();
				count = Integer.parseInt(input);

				// check if < 0
				if (count < 0) {
					controlMenu.getTagLib().println("tErr09");
				} else {
					keepRunning = false;
				}
			} catch (Exception ex) {
				controlMenu.getTagLib().print("tErr08");
			}
		}
		return count;
	}
}
