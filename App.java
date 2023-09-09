import static java.lang.System.out;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        out.println("<----Running App---->");

        //Instances
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 5.50;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 5.25;

        Item item3 = new Item();
        item3.name = "Coffee";
        item3.price = 4.75;

        Item item4 = new Item();
        item4.name = "White Mocha";
        item4.price = 6.50;

        Order order1 = new Order();
        order1.name = "Brendan";
        order1.total = item1.price;
        order1.isReady = true;
        order1.items.add(item1);

        Order order2 = new Order();
        order2.name = "Tori";
        order2.total = item2.price;
        order2.isReady = false;
        order2.items.add(item2);

        Order order3 = new Order();
        order3.name = "Charles";
        order3.total = item3.price*2;
        order3.isReady = true;
        order3.items.add(item3);
        order3.items.add(item3);

        Order order4 = new Order();
        order4.name = "Bella";
        order4.total = item4.price*2;
        order4.isReady = false;
        order4.items.add(item4);
        order4.items.add(item4);
        order4.isReady = true; //can overwrite fields


        //Method Calls
        out.println(item1.name + ": " + item1.price);
        out.println(order1.total);
        out.println(order1.items);
        out.println(order4.total);
        out.println(order4.items);
        out.println(order4.isReady);
    }
}