import static java.lang.System.out;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        out.println("<----Running App---->");

        //Instances
        Item item1 = new Item("Mocha", 5.50);
        Item item2 = new Item("Latte", 5.25);
        Item item3 = new Item("Coffee", 4.75);
        Item item4 = new Item("White Mocha", 6.50);
        //these will default customer name to guest
        Order order1 = new Order();
        Order order2 = new Order();
        // these will have names passed in
        Order order3 = new Order("Brendan");
        Order order4 = new Order("Tori");
        Order order5 = new Order("Bingus");

        //Method Calls
        order1.addItem(item1);
        order2.addItem(item2);
        order2.addItem(item3);
        order3.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item4);
        order5.addItem(item2);
        order3.setIsReady(true);
        order5.setIsReady(true);
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        //! display(); handles most of these calls below
        // out.println(order1.getName());
        // out.println(order3.getName());
        // out.println(order1.getStatusMessage());
        // out.println(order2.getStatusMessage());
        // out.println(order3.getStatusMessage());
        // out.println(order4.getStatusMessage());
        // out.println(order5.getStatusMessage());
        // out.println(order3.getOrderTotal());
    }
}