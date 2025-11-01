package Array;

import java.util.Scanner;

public class Nonrepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int j =0; j<arr.length; j++){
            int c = 0;
            for(int k = 0; k<arr.length; k++){
                if(arr[j] == arr[k]){
                    c++;
                } }
                if (c==1){
                    System.out.println(arr[j]);
                }
            }
        }

    }


