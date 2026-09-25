import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        System.out.println("Original List: " + list);

        list.add(1, "Grapes");
        System.out.println("After Adding at Index 1: " + list);

        System.out.println("Element at Index 2: " + list.get(2));

        list.set(2, "Pineapple");
        System.out.println("After Updating Index 2: " + list);

        list.remove(0);
        System.out.println("After Removing Index 0: " + list);

        list.remove("Orange");
        System.out.println("After Removing 'Orange': " + list);

        System.out.println("Contains 'Mango': " + list.contains("Mango"));
        System.out.println("Size of List: " + list.size());
        System.out.println("Is List Empty: " + list.isEmpty());

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        System.out.println("Iterating Elements:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        list.clear();
        System.out.println("After Clear: " + list);
        System.out.println("Is Empty Now: " + list.isEmpty());
    }
}
