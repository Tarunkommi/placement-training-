import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();

        // 1. Standard additions
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        System.out.println("Initial List: " + languages);

        // 2. Deque Operations (Adding at ends)
        languages.addFirst("HTML");
        languages.addLast("Rust");
        System.out.println("After addFirst & addLast: " + languages);

        // 3. Accessing First and Last elements
        System.out.println("First element: " + languages.getFirst());
        System.out.println("Last element: " + languages.getLast());

        // 4. Removing elements from ends
        languages.removeFirst();
        languages.removeLast();
        System.out.println("After removing ends: " + languages);

        // 5. Using LinkedList as a Queue (FIFO)
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("Customer 1");
        queue.offer("Customer 2");
        System.out.println("Queue Peek: " + queue.peek());
        System.out.println("Served: " + queue.poll());
        System.out.println("Remaining Queue: " + queue);

        // 6. Using LinkedList as a Stack (LIFO)
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack Pop: " + stack.pop());
        System.out.println("Stack Top: " + stack.peek());

        // 7. Iterating through LinkedList
        System.out.print("Iteration: ");
        for (String lang : languages) {
            System.out.print(lang + " -> ");
        }
        System.out.println("null");
    }
}
