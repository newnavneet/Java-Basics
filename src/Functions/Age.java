package Functions;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = eligible(n);
        System.out.println(ans);
    }
    static String eligible(int n){
         if (n>=18){
             return "Person is eligible to vote.";
         }
         return "Person is not eligible to vote.";

    }
}
