package practice;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
      /* Scanner input = new Scanner(System.in);
     //   float number =  input.nextInt();
       // System.out.println(number);

        // typecasting
        int num = (int) 67.5f;
        System.out.println(num);

*/   Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
        int n2 = sc.nextInt();
     int i=1;
     while(i<=10){
        int a =  (n*i) - (n2 * i) ;
        i++;
        System.out.print(a+" ");
     }
    }
}
