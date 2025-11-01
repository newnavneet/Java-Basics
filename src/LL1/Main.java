package LL1;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertAtFirst(3);
//        list.insertAtFirst(2);
//        list.insertAtFirst(8);
//        list.insertAtFirst(17);
//        list.insertLast(43);
//        list.insert(3,100);
//        list.insertLast(33);
//        list.display();
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
        DLL list = new DLL();
        list.insertFirst(8);
        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(5);
        list.insertFirst(13);
        list.insertLast(99);
        list.insert(3,87);
        list.display();


    }
}
