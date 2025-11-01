package Functions;

import java.util.Scanner;

public class ODD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        oddeven();
    }
    static void oddeven(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }

    }
}
