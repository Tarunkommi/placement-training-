import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("         JAVA ARRAYLIST COMPREHENSIVE DEMO        ");
        System.out.println("==================================================\n");

        // 1. Creation and Initialization
        System.out.println("--- 1. Creation and Adding Elements ---");
        ArrayList<String> fruits = new ArrayList<>();

        // add(element) - Appends to the end
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println("Initial List: " + fruits);

        // add(index, element) - Inserts at specific position
        fruits.add(1, "Grapes");
        System.out.println("After add(1, 'Grapes'): " + fruits);

        // addAll(Collection) - Append another collection
        List<String> exoticFruits = Arrays.asList("Dragonfruit", "Kiwi", "Papaya");
        fruits.addAll(exoticFruits);
        System.out.println("After addAll(exoticFruits): " + fruits);

        // addAll(index, Collection) - Insert collection at index
        List<String> berries = Arrays.asList("Strawberry", "Blueberry");
        fruits.addAll(2, berries);
        System.out.println("After addAll(2, berries): " + fruits);


        // 2. Accessing Elements
        System.out.println("\n--- 2. Accessing Elements ---");
        // get(index)
        String fruitAtIndex3 = fruits.get(3);
        System.out.println("Element at index 3: " + fruitAtIndex3);

        // indexOf(element) and lastIndexOf(element)
        fruits.add("Apple"); // Adding duplicate to demonstrate indexOf vs lastIndexOf
        System.out.println("List with duplicate 'Apple': " + fruits);
        System.out.println("First occurrence of 'Apple' (indexOf): " + fruits.indexOf("Apple"));
        System.out.println("Last occurrence of 'Apple' (lastIndexOf): " + fruits.lastIndexOf("Apple"));


        // 3. Updating / Replacing Elements
        System.out.println("\n--- 3. Updating Elements ---");
        // set(index, element)
        String replaced = fruits.set(0, "Pineapple");
        System.out.println("Replaced element at index 0: " + replaced);
        System.out.println("List after set(0, 'Pineapple'): " + fruits);


        // 4. Searching and Checking Properties
        System.out.println("\n--- 4. Checking Properties & Searching ---");
        // size()
        System.out.println("Total elements (size): " + fruits.size());

        // isEmpty()
        System.out.println("Is list empty?: " + fruits.isEmpty());

        // contains(element)
        System.out.println("Contains 'Mango'?: " + fruits.contains("Mango"));
        System.out.println("Contains 'Watermelon'?: " + fruits.contains("Watermelon"));

        // containsAll(Collection)
        System.out.println("Contains all exotic fruits?: " + fruits.containsAll(exoticFruits));


        // 5. Removing Elements
        System.out.println("\n--- 5. Removing Elements ---");
        // remove(index)
        String removedByIndex = fruits.remove(2);
        System.out.println("Removed element at index 2: " + removedByIndex);
        System.out.println("List after remove(index): " + fruits);

        // remove(Object) - Removes first occurrence
        boolean isRemoved = fruits.remove("Banana");
        System.out.println("Was 'Banana' removed?: " + isRemoved);
        System.out.println("List after remove('Banana'): " + fruits);

        // removeAll(Collection)
        fruits.removeAll(berries);
        System.out.println("After removeAll(berries): " + fruits);

        // removeIf(Predicate) - Remove based on condition
        fruits.removeIf(f -> f.startsWith("K"));
        System.out.println("After removeIf(startsWith 'K'): " + fruits);


        // 6. Sorting and Reversing
        System.out.println("\n--- 6. Sorting & Reversing ---");
        // Natural Ascending Order
        Collections.sort(fruits);
        System.out.println("Sorted (Ascending): " + fruits);

        // Descending Order
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("Sorted (Descending): " + fruits);

        // Reverse current order
        Collections.reverse(fruits);
        System.out.println("Reversed order: " + fruits);

        // Shuffle elements
        Collections.shuffle(fruits);
        System.out.println("Shuffled list: " + fruits);


        // 7. Sublist and Cloning
        System.out.println("\n--- 7. SubList & Cloning ---");
        if (fruits.size() >= 3) {
            List<String> sub = fruits.subList(0, 3);
            System.out.println("SubList (0 to 3): " + sub);
        }

        // Clone
        @SuppressWarnings("unchecked")
        ArrayList<String> clonedList = (ArrayList<String>) fruits.clone();
        System.out.println("Cloned ArrayList: " + clonedList);


        // 8. Conversion: ArrayList <-> Array
        System.out.println("\n--- 8. Conversion: ArrayList <-> Array ---");
        // ArrayList to Array
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("Converted to Array: " + Arrays.toString(fruitArray));

        // Array to ArrayList
        String[] colors = {"Red", "Green", "Blue"};
        ArrayList<String> colorList = new ArrayList<>(Arrays.asList(colors));
        System.out.println("Converted Array to ArrayList: " + colorList);


        // 9. Traversing / Iterating
        System.out.println("\n--- 9. Iteration Techniques ---");

        // A. Traditional For Loop
        System.out.print("Traditional For Loop: ");
        for (int i = 0; i < colorList.size(); i++) {
            System.out.print(colorList.get(i) + " ");
        }
        System.out.println();

        // B. Enhanced For Loop (For-Each)
        System.out.print("Enhanced For Loop: ");
        for (String color : colorList) {
            System.out.print(color + " ");
        }
        System.out.println();

        // C. Iterator
        System.out.print("Using Iterator: ");
        Iterator<String> iterator = colorList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // D. ListIterator (Bidirectional)
        System.out.print("ListIterator (Backward): ");
        ListIterator<String> listIterator = colorList.listIterator(colorList.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();

        // E. forEach with Lambda (Java 8+)
        System.out.print("forEach Lambda: ");
        colorList.forEach(color -> System.out.print(color + " "));
        System.out.println();


        // 10. Clearing the List
        System.out.println("\n--- 10. Clearing the List ---");
        fruits.clear();
        System.out.println("List after clear(): " + fruits);
        System.out.println("Is list empty after clear()?: " + fruits.isEmpty());

        System.out.println("\n==================================================");
        System.out.println("          ALL OPERATIONS COMPLETED SUCCESSFULLY   ");
        System.out.println("==================================================");
    }
}
