package ict;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import ict.Command.CMDCancelOrder;
import ict.Command.CMDEditMenu;
import ict.Command.CMDListOrder;
import ict.Command.CMDMakeOrder;
import ict.Command.CMDMarkAsDone;
import ict.Command.CMDShowMenu;
import ict.Command.Command;
import ict.Factory.ChineseSetFactory;
import ict.Factory.LunchSetFactory;
import ict.Factory.WesternSetFactory;
import ict.FoodMenu.*;
import ict.Memento.Caretaker;
import ict.Memento.OrdersMemento;
import ict.Order.*;
import ict.TagLib.TagLib;
import ict.TagLib.Tag_Eng;

public class ControlMenu {
    // var
    private TagLib tagLib;
    private Scanner scanner;
    private Map<Integer, Order> orders;
    private LunchSetFactory chineseFactory;
    private LunchSetFactory westernFactory;
    private FoodMenu chineseMenu;
    private FoodMenu westernMenu;
    private Caretaker careTaker;

    public ControlMenu() {
        tagLib = new Tag_Eng();
        scanner = new Scanner(System.in);
        orders = new LinkedHashMap<>();
        chineseFactory = new ChineseSetFactory();
        westernFactory = new WesternSetFactory();
        careTaker = new Caretaker();
        // create default food menu
        createDefaultFoodMenu();
        //first save 
        firstSave();
    }

    // Getter, Setter
    public Scanner getScanner() {
        return scanner;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public FoodMenu getChineseMenu() {
        return chineseMenu;
    }

    public void setChineseMenu(FoodMenu chineseMenu) {
        this.chineseMenu = chineseMenu;
    }

    public FoodMenu getWesternMenu() {
        return westernMenu;
    }

    public void setWesternMenu(FoodMenu westernMenu) {
        this.westernMenu = westernMenu;
    }

    public TagLib getTagLib() {
        return tagLib;
    }

    public LunchSetFactory getChineseFactory() {
        return chineseFactory;
    }

    public LunchSetFactory getWesternFactory() {
        return westernFactory;
    }

    public void setOrders(Map<Integer, Order> orders) {
        this.orders = orders;
    }
    // End Getter, Setter

    // run
    public void run() {
        boolean keepRunning = true;
        String input = "";
        Command command;

        while (keepRunning) {
            printCommandMenu();
            input = scanner.nextLine();
            switch (input) {
                // edit
                case "e":
                    command = new CMDEditMenu(this);
                    command.execute();
                    break;
                // show
                case "s":
                    command = new CMDShowMenu(this);
                    command.execute();
                    break;
                // place order
                case "p":
                    command = new CMDMakeOrder(this);
                    command.execute();
                    break;
                // cancel order
                case "c":
                    command = new CMDCancelOrder(this);
                    command.execute();
                    break;
                // list order
                case "l":
                    command = new CMDListOrder(this);
                    command.execute();
                    break;

                case "d":
                    command = new CMDMarkAsDone(this);
                    command.execute();
                    break;
                case "q":
                    keepRunning = false;
                    scanner.close();
                    tagLib.println("t003");
                    break;
                default:
                    tagLib.println("tErr02");
            }
        }
    }

    // other methods
    private void createDefaultFoodMenu() {
        String mainDishName = tagLib.getMsg("tErr06"); // not set

        chineseMenu = chineseFactory.createFoodMenu(this, chineseFactory.createMainDish(this, mainDishName), 0, 0);
        westernMenu = westernFactory.createFoodMenu(this, chineseFactory.createMainDish(this, mainDishName), 0, 0);
    }

    private void firstSave() {
        //first save
        careTaker.setChineseStockMemento(chineseMenu.save());
        careTaker.setWesternStockMemento(westernMenu.save());
        careTaker.setOrdersMemento(new OrdersMemento(orders));
    }


    private void printCommandMenu() {
        tagLib.println("t001");
        tagLib.println("t002");
    }
}
