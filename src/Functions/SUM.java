package Functions;
import java.util.*;
import java.util.Scanner;

public class SUM {
    public static void main(String[] args) {

        int ans =sum2();
        System.out.println(ans);
    }
   static  int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = sc.nextInt();
        System.out.println("Enter thr numbeer");
        int num2= sc.nextInt();
        int sum = num2+ num1;
        return sum;

    }

}
