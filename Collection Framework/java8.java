
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        // "copy on write" means that whenever a write operation
        // like adding or removing an element
        // instead of directly modifying the existing list
        // a new copy of the list is created , and the modification is applied to that copy
        // this ensures that other threads reading the list while it's being modified are unaffected.

        // read operation-> fast and direct , since they happen on a stable list without interference from modification.
        // write operation-> a new copy of the list is created for every modification.
        // the reference to the list is then updated so that subsequent reads use this new list.
        // notepad --> notepad-copy
        // read more when read things is more and write is less

        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("milk");
        shoppingList.add("eggs");
        shoppingList.add("bread");
        System.out.println("Initial shopping List: " + shoppingList);

        for(String item : shoppingList) {
            System.out.println(item);
            // try to modify the list while reading
            if(item.equals("eggs")) {
                shoppingList.add("butter");
                System.out.println("Added butter while reading.");
            }
        }
        System.out.println("updated shopping List: " + shoppingList);

    }
}
