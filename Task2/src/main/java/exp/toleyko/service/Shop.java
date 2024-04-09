package exp.toleyko.service;

import exp.toleyko.entity.Item;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    public static final Map<String, Double> items = new HashMap<>();
    static {
        items.put("Pen", 1.0);
        items.put("Book", 5.5);
        items.put("Phone", 300.0);
        items.put("Car", 30000.0);
    }

    public static ArrayList<Item> getOrderedItems(String[] names){
        ArrayList<Item> orderedItems = new ArrayList<>();
        for (String name : names) {
            orderedItems.add(new Item(name, items.get(name)));
        }
        return orderedItems;
    };

    public static double getOrderCost(ArrayList<Item> order) {
        double cost = 0;
        for (Item item : order) {
            cost += item.getCost();
        }
        return cost;
    }
}
