public class StackLL {
    Node top;

    public StackLL() {
        top = null;
    }
    boolean isEmpty(){
        return top == null;
    }
    void push(int value) {
        Node newnode = new Node(value);
        newnode.next = top;
        top = newnode;
    }
    int  pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }

        return top.data;
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        else {
            Node temp = top;
            while (temp!=null){
                System.out.print(temp.data + "_");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    private class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
