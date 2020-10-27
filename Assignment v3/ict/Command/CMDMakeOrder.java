package ict.Command;


import ict.ControlMenu;
import ict.Factory.LunchSetFactory;
import ict.Food.Drink.Drink;
import ict.Food.MainDish.MainDish;
import ict.Food.SideDish.SideDish;
import ict.FoodMenu.FoodMenu;
import ict.Memento.Memento;
import ict.Order.Order;

public class CMDMakeOrder implements Command {
	private ControlMenu controlMenu;

	public CMDMakeOrder(ControlMenu controlMenu) {
		this.controlMenu = controlMenu;
	}

	@Override
	public void execute() {
		// actions
		printConsoleMenu();

	}

	// other Method
	private void printConsoleMenu() {
		// var
		boolean keepRunning = true;
		String input = "";

		// order var
		MainDish mainDish;
		SideDish sideDish;
		Drink drink;
		int staffNo;
		int locationNo;

		// object
		Order order;
		FoodMenu chineseMenu = controlMenu.getChineseMenu();
		FoodMenu westernMenu = controlMenu.getWesternMenu();
		LunchSetFactory chineseFactory = controlMenu.getChineseFactory();
		LunchSetFactory westernFactory = controlMenu.getWesternFactory();

		// print header
		controlMenu.getTagLib().println("t301");

		// loop, ask for type
		while (keepRunning) {
			controlMenu.getTagLib().print("t302");

			input = controlMenu.getScanner().nextLine();

			// switch
			switch (input) {
				case "c":
					// if c, create chinese order
					// check if set available
					if (isMenuAvailable(chineseMenu)) {
						// get order var
						mainDish = chineseMenu.getMainDish();
						sideDish = chineseFactory.createSideDish(controlMenu, controlMenu.getTagLib().getMsg("t310"));
						drink = getDrinkInput();
						staffNo = getStaffNoInput();
						locationNo = getLocationNoInput();

						//make order
						order = chineseFactory.createOrder(controlMenu, mainDish, sideDish, drink, staffNo, locationNo);
						//add to stack

						//save status
						// controlMenu.saveStatus(staffNo, new Memento(order));
						// - 1 count
						chineseMenu.addCount();


					} else {
						keepRunning = false;
						controlMenu.getTagLib().println("t309");
					}
					break;
				case "w":
					// if w, create western order
					// check if set available
					if (isMenuAvailable(westernMenu)) {
						// get order var
						mainDish = westernMenu.getMainDish();
						sideDish = getSideDishInput();
						drink = getDrinkInput();
						staffNo = getStaffNoInput();
						locationNo = getLocationNoInput();

						//make order
						order = chineseFactory.createOrder(controlMenu, mainDish, sideDish, drink, staffNo, locationNo);
						//add to stack

						//save status

						//-1 count
						westernMenu.minusCount();

					} else {
						keepRunning = false;
						controlMenu.getTagLib().println("t309");
					}
					break;
				default:
			}
		}
	}

	private boolean isMenuAvailable(FoodMenu foodMenu) {
		return foodMenu.getCount() > 0;
	}

	private SideDish getSideDishInput(){
		SideDish sideDish;

		return null;
	}

	private Drink getDrinkInput(){
		Drink drink;

		return null;
	}

	private int getStaffNoInput(){
		// var
		boolean keepRunning = true;
		String input = "";
		int staffNo = 0;
		
		//check if has order alreadly

		return staffNo;

	}

	private int getLocationNoInput(){
		// var
		boolean keepRunning = true;
		String input = "";
		int locationNo = 0;

		return locationNo;
	}

}
