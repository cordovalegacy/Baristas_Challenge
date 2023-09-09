import java.util.ArrayList;

public class Order {
    public String name;
    public double total;
    public boolean isReady;
    public ArrayList<Item> items;

    public Order() { // name has to match the class if public is used, can only be one
        items = new ArrayList<>(); // Initialize the ArrayList in the constructor
    }

}