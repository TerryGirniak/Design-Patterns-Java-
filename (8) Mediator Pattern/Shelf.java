import java.util.ArrayList;
import java.util.Iterator;

public class Shelf {

    private ArrayList<Item> items = new ArrayList<>();

    public void putItem(Item item){
        items.add(item);
        System.out.println(item.getName() + " placed.");
    }

    public void takeItem(Item item){

        try {
            items.remove(items.indexOf(item));
            System.out.println(item.getName() + " grabbed.");

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(item.getName() + " wasn't found on this shelf.");
        }
    }

    public void displayItems(){

        System.out.println("\nItems on this shelf:");

        for (Item i : items) {
            System.out.println(i.getName());
        }
    }
}
