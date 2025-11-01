package practice;

import java.util.Scanner;

public class Present {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n-1];
        int [] c = new int[n-2];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int j=0; j<b.length; j++){
            b[j] = sc.nextInt();
        }
        for (int k= 0 ; k<c.length;k++){
            c[k] = sc.nextInt();
        }
        System.out.println(a[n-1]);
        System.out.println(b);



    }
}
