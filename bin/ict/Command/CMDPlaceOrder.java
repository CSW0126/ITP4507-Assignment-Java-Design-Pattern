package ict.Command;

import java.util.Queue;
import java.util.Scanner;

import ict.ControlMenu;
import ict.Factory.AbstractLunchSetFactory;
import ict.Factory.ChineseSetFactory;
import ict.Food.Drink.IDrink;
import ict.Food.SideDish.ISideDish;
import ict.FoodMenu.AbstractFoodMenu;
import ict.Order.AbstractOrder;
import ict.TagLib.TagLib;

public class CMDPlaceOrder implements ICommand {
    private ControlMenu controlMenu;
    private TagLib tagLib;
    private Scanner sc;
    private AbstractLunchSetFactory chineseSetFactory;
    private AbstractLunchSetFactory westernSetFactory;
    private AbstractFoodMenu chineseMenu;
    private AbstractFoodMenu westernMenu;
    private Queue<AbstractOrder> orders;

    public CMDPlaceOrder(ControlMenu controlMenu) {
        this.tagLib = controlMenu.getTagLib();
        this.sc = controlMenu.getScanner();
        // factory
        chineseSetFactory = controlMenu.getChineseFactory();
        westernSetFactory = controlMenu.getWesternFactory();
        // menu
        chineseMenu = controlMenu.getChineseMenu();
        westernMenu = controlMenu.getWesternMenu();
        // orders
        orders = controlMenu.getOrders();

        this.controlMenu = controlMenu;
    }

    @Override
    public void execute() {
        printOptions();
    }

    private void printOptions() {

        if (!isAvaliableMenu(chineseMenu) && !isAvaliableMenu(westernMenu)) {
            tagLib.println("tErr18");
            return;
        }

        String input = "";

        // print header
        tagLib.println("t301");
        for (;;) {
            tagLib.println("t302");
            // get Input
            input = sc.nextLine();

            // chinese
            if (input.equals("c")) {
                // check available
                if (isMenuAvailable(chineseMenu)) {
                    // make order
                    makeOrder(chineseSetFactory);
                } else {
                    tagLib.println("t309");
                }
                //end loop
                break;
                // western
            } else if (input.equals("w")) {
                // check available
                if (isMenuAvailable(westernMenu)) {
                    // make order
                    makeOrder(westernSetFactory);
                } else {
                    tagLib.println("t309");
                }
                //end loop
                break;
            } else {
                tagLib.println("tErr07");
            }
        }
    }

    private boolean isAvaliableMenu(AbstractFoodMenu menu) {
        return menu.getCount() > 0;
    }

    private void makeOrder(AbstractLunchSetFactory factory) {
        AbstractOrder order;
        order = createOrderFromInput(factory);
        // add order
        orders.add(order);
        // count -1
        order.getMenu().subtractCount();

        controlMenu.addOrderMemento(order.save(),order.getStaffNo());

        tagLib.println("t306");
    }

    private boolean isMenuAvailable(AbstractFoodMenu menu) {
        return menu.getCount() > 0;
    }

    private AbstractOrder createOrderFromInput(AbstractLunchSetFactory factory) {
        ISideDish sideDish;
        IDrink drink;
        int staffNo;
        int locationNo;

        for (;;) {
            // side dish
            if (factory instanceof ChineseSetFactory) {
                sideDish = factory.createSideDish(null);
            } else {
                for (;;) {
                    sideDish = factory.createSideDish(getTypeInput(factory.getSideDishTypeMsg()));
                    if (sideDish != null) {
                        break;
                    } else {
                        tagLib.println("tErr07");
                    }
                }
            }

            for (;;) {
                drink = factory.createDrink(getTypeInput(factory.getDrinkTypeMsg()));
                if (drink != null) {
                    break;
                } else {
                    tagLib.println("tErr03");
                }
            }

            staffNo = getStaffNoInput();
            locationNo = getLocationNoInput();
            break;
        }
        return factory.createOrder(sideDish, drink, staffNo, locationNo);
    }

    private String getTypeInput(String msg) {
        String input = "";
        for (;;) {
            // print Question
            System.out.print(msg);
            input = sc.nextLine();

            if (input.isBlank()) {
                tagLib.println("tErr10");
            } else {
                break;
            }
        }

        return input;

    }

    private int getStaffNoInput() {
        String input = "";
        int staffNo;

        for (;;) {
            // print Question
            tagLib.println("t304");
            input = sc.nextLine();

            try {
                staffNo = Integer.parseInt(input);

                // check duplication
                if (!isDupOrder(staffNo)) {
                    break;
                }
            } catch (Exception ex) {
                tagLib.println("tErr08");
            }
        }

        return staffNo;
    }

    private int getLocationNoInput() {
        String input = "";
        int locationNo;

        for (;;) {
            // print Question
            tagLib.println("t305");
            input = sc.nextLine();
            try {
                locationNo = Integer.parseInt(input);
                break;
            } catch (Exception ex) {
                tagLib.print("tErr08");
            }
        }
        return locationNo;
    }

    private boolean isDupOrder(int staffNo) {
        for (AbstractOrder o : orders) {
            if (o.getStaffNo() == staffNo) {
                tagLib.println("tErr13");
                tagLib.println("tErr14");

                System.out.println(o.toString() + "\n");
                return true;
            }
        }
        return false;
    }

}
