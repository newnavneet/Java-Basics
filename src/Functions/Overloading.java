package Functions;

public class Overloading {
    public static void main(String[] args) {
        //fun(90);
        fun("Harsh");
    }
    static void fun(int a){
        System.out.println(a);
        System.out.println("Kunal");
    }
    static void fun(String name){
        System.out.println(name);
        System.out.println(90);
    }
}
