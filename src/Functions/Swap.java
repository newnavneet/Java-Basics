package Functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a +" " + b);

        String  name = "Navneet Sharma";
        changename(name);
        System.out.println(name);
    }

    static void changename(String name) {
        name = " Navneet Sharma";
    }

    static void swap(int a, int b){
        int temp = a;
        a = b ;
        b = temp;

    }
}
