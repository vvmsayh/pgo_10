package task2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
}

public class main {
    public static void main(String[] args) {
        executeItemOperations();
    }

    public static void executeItemOperations() {
        ArrayList<Item> itemList = new ArrayList<>();

        itemList.add(new Item(1, "Item One"));
        itemList.add(new Item(2, "Item Two"));
        itemList.add(new Item(3, "Item Three"));
        itemList.add(new Item(4, "Item Four"));
        itemList.add(new Item(5, "Item Five"));

        // Use the get() method to view the contents and call the show() method for each item
        for (int i = 0; i < itemList.size(); i++) {
            itemList.get(i).show();
        }

        HashMap<Integer, String> itemMap = new HashMap<>();

        for (Item item : itemList) {
            itemMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

