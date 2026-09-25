package collections.linkedlist;

class DNode {
    int data;
    DNode prev;
    DNode next;

    public DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedListDemo {
    private DNode head;
    private DNode tail;

    public void insertAtHead(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        DNode newNode = new DNode(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void insertAfter(int targetKey, int data) {
        DNode current = head;
        while (current != null && current.data != targetKey) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Key " + targetKey + " not found!");
            return;
        }
        if (current == tail) {
            insertAtEnd(data);
            return;
        }
        DNode newNode = new DNode(data);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }

    public void delete(int key) {
        if (head == null) return;

        DNode current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Key " + key + " not found!");
            return;
        }

        if (current == head && current == tail) {
            head = tail = null;
            return;
        }

        if (current == head) {
            head = head.next;
            head.prev = null;
            return;
        }

        if (current == tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

    public void reverse() {
        if (head == null || head.next == null) return;

        DNode current = head;
        DNode temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        tail = head;
        if (temp != null) {
            head = temp.prev;
        }
    }

    public void displayForward() {
        System.out.print("Forward Traversal:  head <-> ");
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        System.out.print("Backward Traversal: tail <-> ");
        DNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedListDemo dll = new DoublyLinkedListDemo();

        dll.insertAtHead(20);
        dll.insertAtHead(10);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        dll.displayForward();
        dll.displayBackward();

        dll.insertAfter(20, 25);
        dll.displayForward();

        dll.delete(10);
        dll.delete(40);
        dll.delete(25);
        dll.displayForward();

        dll.reverse();
        dll.displayForward();
    }
}
