package ict;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import ict.Command.ICommand;
import ict.Factory.AbstractCommandFactory;
import ict.Factory.AbstractLunchSetFactory;
import ict.Factory.ChineseSetFactory;
import ict.Factory.CommandFactory;
import ict.Factory.WesternSetFactory;
import ict.FoodMenu.AbstractFoodMenu;
import ict.Order.AbstractOrder;
import ict.TagLib.TagLib;
import ict.TagLib.Tag_Eng;

public class ControlMenu {
    // var
    private TagLib tagLib;
    private Scanner scanner;
    private Queue<AbstractOrder> orders;
    private Queue<AbstractOrder> doneOrders;
    private AbstractLunchSetFactory chineseFactory;
    private AbstractLunchSetFactory westernFactory;
    private AbstractCommandFactory commandFactory;
    private CareTaker careTaker;
    private AbstractFoodMenu chineseMenu;
    private AbstractFoodMenu westernMenu;
    private ICommand command;

    public ControlMenu() {
        tagLib = new Tag_Eng();
        scanner = new Scanner(System.in);
        orders = new LinkedList<>();
        doneOrders = new LinkedList<>();
        chineseFactory = new ChineseSetFactory(this);
        westernFactory = new WesternSetFactory(this);
        commandFactory = new CommandFactory(this);
        careTaker = new CareTaker();
        createDefaultMenu();
    }

    // main program
    public void run() {
        String input = "";

        for (;;) {
            // print menu && options
            printCommandMenu();

            // look for input
            input = scanner.nextLine();
            // getCommand according to the input
            command = commandFactory.getCommand(input);

            // if not null, execute
            if (command != null) {
                command.execute();
            } else {
                tagLib.println("tErr02");
            }
        }
    }

    // private method//

    private void printCommandMenu() {
        tagLib.println("t001");
        tagLib.println("t002");
    }

    private void createDefaultMenu() {
        // default menu
        chineseMenu = chineseFactory.createFoodMenu(null,0,0);
        westernMenu = westernFactory.createFoodMenu(null,0,0);
    }

    // End private method//

    // Getter, Setter//
    public TagLib getTagLib() {
        return tagLib;
    }

    public void setTagLib(TagLib tagLib) {
        this.tagLib = tagLib;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Queue<AbstractOrder> getOrders() {
        return orders;
    }

    public void setOrders(Queue<AbstractOrder> orders) {
        this.orders = orders;
    }

    public AbstractLunchSetFactory getChineseFactory() {
        return chineseFactory;
    }

    public void setChineseFactory(AbstractLunchSetFactory chineseFactory) {
        this.chineseFactory = chineseFactory;
    }

    public AbstractLunchSetFactory getWesternFactory() {
        return westernFactory;
    }

    public void setWesternFactory(AbstractLunchSetFactory westernFactory) {
        this.westernFactory = westernFactory;
    }

    public AbstractCommandFactory getCommandFactory() {
        return commandFactory;
    }

    public void setCommandFactory(AbstractCommandFactory commandFactory) {
        this.commandFactory = commandFactory;
    }

    public CareTaker getCareTaker() {
        return careTaker;
    }

    public void setCareTaker(CareTaker careTaker) {
        this.careTaker = careTaker;
    }

    public AbstractFoodMenu getChineseMenu() {
        return chineseMenu;
    }

    public void setChineseMenu(AbstractFoodMenu chineseMenu) {
        this.chineseMenu = chineseMenu;
    }

    public AbstractFoodMenu getWesternMenu() {
        return westernMenu;
    }

    public void setWesternMenu(AbstractFoodMenu westernMenu) {
        this.westernMenu = westernMenu;
    }

    public Queue<AbstractOrder> getDoneOrders() {
        return doneOrders;
    }

    public void setDoneOrders(Queue<AbstractOrder> doneOrders) {
        this.doneOrders = doneOrders;
    }

    // End Getter, Setter//
}
