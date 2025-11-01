package Functions;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println(" Area is " + Area());
        System.out.println("Circumference is " + Circumference());
    }
    static double Area(){
        Scanner sc =  new Scanner(System.in);
        int r = sc.nextInt();
        double a = Math.PI * r * r;
        return a;
    }
    static double Circumference() {
        Scanner sc = new Scanner(System.in);
         int r = sc.nextInt();
        double a = Math.PI * 2 * r;
        return a;
    }
}
