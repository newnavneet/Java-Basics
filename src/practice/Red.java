package practice;

import java.util.Scanner;

public class Red {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bill = pen+pencil+eraser;
        System.out.println(bill);
        float newbill = bill * 0.18f;
        System.out.println(newbill);

    }
}
