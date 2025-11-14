public class Main {
    public static void main(String[] args) {
        StackLL stackLL = new StackLL();
        stackLL.push(13);
        stackLL.push(15);
        stackLL.push(15);
        stackLL.push(10);
        stackLL.push(19);
        stackLL.display();
        System.out.println(stackLL.peek());
        System.out.println(stackLL.pop());
        stackLL.display();


    }
}