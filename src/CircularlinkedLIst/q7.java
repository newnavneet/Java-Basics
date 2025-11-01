package CircularlinkedLIst;

class Node {
    int data;
    Node next;
    Node prev;
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class CircularDoublyLinkedList {
    Node head = null;
    Node tail = null;
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }
    }
    void delete(int key) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        if (head == tail && head.data == key) {
            head = null;
            tail = null;
            return;
        }
        do {
            if (current.data == key) {
                if (current == head) {
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        } while (current != head);
        System.out.println("Element not found!");
    }
    void displayForward() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        System.out.print("Forward: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }
    void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = tail;
        System.out.print("Backward: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.prev;
        } while (current != tail);
        System.out.println("(back to tail)");
    }
}
public class q7 {
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        System.out.println("Original List:");
        list.displayForward();
        list.displayBackward();
        list.delete(10);
        System.out.println("\nAfter deleting head (10):");
        list.displayForward();
        list.delete(40);
        System.out.println("\nAfter deleting tail (40):");
        list.displayForward();
        list.delete(25);
        System.out.println("\nTrying to delete non-existing element (25):");
        list.displayForward();
    }
}
