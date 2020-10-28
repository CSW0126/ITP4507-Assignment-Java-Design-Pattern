package ict;

import java.util.Queue;
import java.util.Scanner;

import ict.Factory.AbstractCommandFactory;
import ict.Factory.AbstractLunchSetFactory;
import ict.FoodMenu.AbstractFoodMenu;
import ict.Order.AbstractOrder;
import ict.TagLib.TagLib;

public class ControlMenu {
    // var
    private TagLib tagLib;
    private Scanner scanner;
    private Queue<AbstractOrder> orders;
    private AbstractLunchSetFactory chineseFactory;
    private AbstractLunchSetFactory westernFactory;
    private AbstractCommandFactory commandFactory;
    private CareTaker careTaker;
    private AbstractFoodMenu chineseMenu;
    private AbstractFoodMenu westernMenu;
    

    public void run() {

    }
}
