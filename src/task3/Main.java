package task3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        executeItemOperations();
        taskThree();
    }

    public static void executeItemOperations() {
        // Create an ArrayList container
        ArrayList<Item> itemList = new ArrayList<>();

        // Insert objects of the Item class into the ArrayList
        itemList.add(new Item(1, "Item One"));
        itemList.add(new Item(2, "Item Two"));
        itemList.add(new Item(3, "Item Three"));
        itemList.add(new Item(4, "Item Four"));
        itemList.add(new Item(5, "Item Five"));

        // Use the get() method to view the contents and call the show() method for each item
        for (int i = 0; i < itemList.size(); i++) {
            itemList.get(i).show();
        }

        // Create a HashMap container
        HashMap<Integer, String> itemMap = new HashMap<>();

        // Using a for-each loop, place all created objects into the HashMap
        for (Item item : itemList) {
            itemMap.put(item.getId(), item.getName());
        }

        // Iterate through the map and output the identifier and name of the current item
        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public static void taskThree() {
        ArrayList<Item> itemList = new ArrayList<>();
        for (int i = 6; i <= 15; i++) {
            itemList.add(new Item(i, "Item " + i));
        }
      List<Item> subList = itemList.subList(0, 5);


        Set<Item> itemSet = new HashSet<>(subList);

        for (Item item : itemSet) {
            System.out.println(item);
        }
    }
}
