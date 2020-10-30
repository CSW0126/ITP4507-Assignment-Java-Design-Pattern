package ict.TagLib;

import java.util.HashMap;
import java.util.Map;

public class Tag_Eng implements TagLib {
    private Map<String, String> msgs;

    public Tag_Eng() {
        msgs = new HashMap<String, String>();
        // create map
        createMapMessage();
    }

    private void createMapMessage() {
        // err
        msgs.put("tErr01", "No this ID");
        msgs.put("tErr02", "No this command! Please try again! \n");
        msgs.put("tErr03", "No this Type of Drink!");
        msgs.put("tErr04", "Style Not Set");
        msgs.put("tErr05", "No Description set");
        msgs.put("tErr06", "Not Set");
        msgs.put("tErr07", "No this Type");
        msgs.put("tErr08", "Please enter Integer Number! \n");
        msgs.put("tErr09", "Can Not Less than 0! \n");
        msgs.put("tErr10", "Can Not be Empty, try again! \n");
        msgs.put("tErr11", "Invalid input! ");
        msgs.put("tErr12", "No Order! \n");
        msgs.put("tErr13", "This staff have order alreadly!");
        msgs.put("tErr14", "His/Her Order Details : ");
        // menu
        msgs.put("t001", "Please enter command: [ e | s | p | c | l | d | q]");
        msgs.put("t002",
                "e = Edit menu, s = Show menu, p = Place o rder, c = Cancel order, l = List orders, d = order is Done , q = Quit");
        msgs.put("t003", "Thank you for using this program. Bye !");
        // edit menu
        msgs.put("t101", "Edit Menu: ");
        msgs.put("t102", "Chinese or Western (c | w): ");
        msgs.put("t103", "Enter main dish: ");
        msgs.put("t104", "Enter price: ");
        msgs.put("t105", "Menu Updated ");
        // show menu
        msgs.put("t201", "Chinese style Business Set Lunch ");
        msgs.put("t202", "Main dish: ");
        msgs.put("t203", "with rice, Chinese soup, Chinese tea ");
        msgs.put("t204", "price: ");
        msgs.put("t205", "available count: ");
        msgs.put("t206", "Western style Business Set Lunch ");
        msgs.put("t207", "with rice/spaghetti/French fries ");
        msgs.put("t208", "Western style Business Set Lunch (available count =");
        msgs.put("t209", "Chinese style Business Set Lunch (available count =");
        // place order
        msgs.put("t301", "Place Order ");
        msgs.put("t302", "Chinese or Western (c | w): ");
        msgs.put("t303", "Oolong Tea: hot or iced (h | i): ");
        msgs.put("t304", "Staff Number: ");
        msgs.put("t305", "Office Location: ");
        msgs.put("t306", "Order Placed ");
        msgs.put("t307", "side: rice, spaghetti, French fries (r | s | f): ");
        msgs.put("t308", "tea or coffee, hot or iced (ht| it | hc | ic): ");
        msgs.put("t309", "Sold Out! \n");
        msgs.put("t310", "Chinese Rice");
        msgs.put("t311", "Rice");
        msgs.put("t312", "Spaghetti");
        msgs.put("t313", "French fries");

        // list order
        msgs.put("t401", "\nOutstanding Orders ");
        msgs.put("t402", "C: ");
        msgs.put("t403", "W: ");
        msgs.put("t404", " : ");
        msgs.put("t405", "Staff No. : ");
        msgs.put("t406", "Location No. : ");
        msgs.put("t407", "Chinese Soup, ");
        msgs.put("t408", "Western Soup, ");
        // cancel order
        msgs.put("t501", "Cancel Order");
        msgs.put("t502", "Staff Number: ");
        msgs.put("t503", "Order Cancelled");
        // order is Done
        msgs.put("t601", "\nComplete Order");
        msgs.put("t602", "Order marked as done \n");
        msgs.put("t603", "No Orders! \n");
        // drink type
        msgs.put("t701", "Hot ");
        msgs.put("t702", "Cold ");
        msgs.put("t703", "Tea ");
        msgs.put("t704", "Coffee ");
        msgs.put("t705", "Oolong Tea ");
        // type
        msgs.put("t801", "Drink");
        msgs.put("t802", "Main Dish");
        msgs.put("t803", "Side Dish");
        msgs.put("t804", "Order");
        msgs.put("t805", "Food Menu");

    }

    public Map<String, String> getMsgs() {
        return msgs;
    }

    public String getMsg(String id) {
        String msg = msgs.get(id);
        if (msg != null) {
            return msgs.get(id);
        } else {
            return msgs.get("tErr01");
        }
    }

    public void print(String id) {
        String msg = msgs.get(id);
        if (msg != null) {
            System.out.print(msg);
        } else {
            System.out.print(msgs.get("tErr01"));
        }
    }

    public void println(String id) {
        String msg = msgs.get(id);
        if (msg != null) {
            System.out.println(msg);
        } else {
            System.out.println(msgs.get("tErr01"));
        }
    }
}
