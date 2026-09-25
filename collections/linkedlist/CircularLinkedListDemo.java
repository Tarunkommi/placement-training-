package collections.linkedlist;

class CNode {
    int data;
    CNode next;

    public CNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedListDemo {
    private CNode tail;
    private int size;

    public CircularLinkedListDemo() {
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public void insertAtHead(int data) {
        CNode newNode = new CNode(data);
        if (isEmpty()) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        CNode newNode = new CNode(data);
        if (isEmpty()) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void delete(int key) {
        if (isEmpty()) return;

        CNode head = tail.next;
        CNode curr = head;
        CNode prev = tail;

        if (head == tail && head.data == key) {
            tail = null;
            size--;
            return;
        }

        if (head.data == key) {
            tail.next = head.next;
            size--;
            return;
        }

        do {
            prev = curr;
            curr = curr.next;
            if (curr.data == key) {
                prev.next = curr.next;
                if (curr == tail) {
                    tail = prev;
                }
                size--;
                return;
            }
        } while (curr != head);

        System.out.println("Key " + key + " not found!");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        CNode head = tail.next;
        CNode curr = head;

        System.out.print("Circular List: ");
        do {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != head);
        System.out.println("(loops back to " + head.data + ")");
    }

    public static void main(String[] args) {
        CircularLinkedListDemo cll = new CircularLinkedListDemo();

        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.insertAtHead(5);
        cll.display();

        cll.delete(5);
        cll.delete(30);
        cll.display();

        cll.delete(20);
        cll.delete(10);
        cll.display();
    }
}
