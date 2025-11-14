package Queuee;

public class myq {
    private int[] arr;
    private int capacity;
    private int size;

    public myq(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size =0;
    }

    boolean isEmpty(){
        return size ==0;
    }
    boolean isFull(){
        return size== capacity;
    }
   public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue Overflow");
            return;
        }
        arr[size] = value;
        size++;
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[0];
    }
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[size - 1];
    }

}
