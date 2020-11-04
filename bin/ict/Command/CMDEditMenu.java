package ict.Command;

import java.util.Scanner;

import ict.ControlMenu;
import ict.Factory.AbstractLunchSetFactory;
import ict.Food.MainDish.IMainDish;
import ict.FoodMenu.AbstractFoodMenu;
import ict.TagLib.TagLib;

public class CMDEditMenu implements ICommand {
    private AbstractFoodMenu chineseMenu;
    private AbstractFoodMenu westernMenu;
    private AbstractLunchSetFactory chineseSetFactory;
    private AbstractLunchSetFactory westernSetFactory;
    private Scanner sc;
    private TagLib taglib;

    public CMDEditMenu(ControlMenu controlMenu) {
        // menu object
        this.chineseMenu = controlMenu.getChineseMenu();
        this.westernMenu = controlMenu.getWesternMenu();
        // factory object
        this.chineseSetFactory = controlMenu.getChineseFactory();
        this.westernSetFactory = controlMenu.getWesternFactory();
        // scanner, taglib
        this.sc = controlMenu.getScanner();
        this.taglib = controlMenu.getTagLib();
    }

    @Override
    public void execute() {
        printOptions();
    }

    private void printOptions() {
        String input = "";

        // print header
        taglib.println("t101");

        for (;;) {
            taglib.println("t102");

            input = sc.nextLine();

            // type "c" or "w"
            if (input.equals("c")) {
                editMenuFromInput(chineseSetFactory, chineseMenu);
                break;
            } else if (input.equals("w")) {
                editMenuFromInput(westernSetFactory, westernMenu);
                break;
            } else {
                taglib.println("tErr07");
            }
        }
    }

    private void editMenuFromInput(AbstractLunchSetFactory factory, AbstractFoodMenu menu) {
        IMainDish mainDish;
        int price;
        int count;
        // get input
        mainDish = factory.createMainDish(getMainDishInput());
        price = getPriceInput();
        count = getCountInput();
        // set to menu
        menu.setMainDish(mainDish);
        menu.setPrice(price);
        menu.setCount(count);

        taglib.println("t105");
    }

    private String getMainDishInput() {
        String dishName = "";

        for (;;) {
            // print questions
            taglib.println("t103");
            // get input
            dishName = sc.nextLine();
            // if not blank input
            if (!dishName.isBlank()) {
                break;
            } else {
                taglib.print("tErr10");
            }
        }

        return dishName;
    }

    private int getPriceInput() {
        String input = "";
        int price = 0;

        for (;;) {
            try {
                // print question
                taglib.println("t104");
                // get input
                input = sc.nextLine();
                price = Integer.parseInt(input);

                // check if < 0
                if (price > 0) {
                    break;
                } else {
                    taglib.println("tErr09");
                }
            } catch (Exception ex) {
                taglib.println("tErr08");
            }
        }
        return price;
    }

    private int getCountInput() {
        String input = "";
        int count = 0;

        for (;;) {
            try {
                // print header
                taglib.println("t205");
                input = sc.nextLine();
                count = Integer.parseInt(input);

                // check if 0
                if (count > 0) {
                    break;
                } else {
                    taglib.println("tErr09");
                }
            } catch (Exception ex) {
                taglib.println("tErr08");
            }
        }
        return count;
    }
}
