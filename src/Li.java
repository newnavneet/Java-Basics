class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList {
    Node head;
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }

    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
    void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (position < 1) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 1; current != null && i < position - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Position out of range!");
            return;
        }

        current.next = current.next.next;
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}public class Li {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        System.out.println("Original list:");
        list.display();
        list.deleteFromBeginning();
        System.out.println("\nAfter deleting from beginning:");
        list.display();
        list.deleteFromEnd();
        System.out.println("\nAfter deleting from end:");
        list.display();

        list.deleteFromPosition(2);
        System.out.println("\nAfter deleting from position 2:");
        list.display();
    }
}
