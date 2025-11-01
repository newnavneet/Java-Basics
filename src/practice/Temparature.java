package practice;

import java.util.Scanner;

public class Temparature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float Celsius = in.nextFloat();
        float fahreneit = (Celsius * 9/5) + 32;
        System.out.println(fahreneit);

    }
}
