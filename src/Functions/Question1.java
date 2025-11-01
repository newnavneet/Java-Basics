package Functions;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = Prime(n);
        System.out.println(ans);
    }
    static boolean Prime(int n){

        if(n <=1){
            return false;
        }
        int c = 2;
        for(int i =c; i<n; i++){
            if(n%c == 0){
                return false;
            }
          c++;
        }
     return true;
    }
}
