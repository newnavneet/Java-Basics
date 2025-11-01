package practice;

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int p = 1;
        int count = 2;

        while(count <= n){
            int temp = p;
            p = p + a;
            a = temp;
            count++;

        }
        /*for(int i=0 ; i<n; i++){

            int c =  a + p ;
            a = p ;
            p = c;
        }*/
        System.out.println(p);


    }
}
