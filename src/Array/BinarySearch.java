package Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int x = sc.nextInt();
       for(int i=0; i<arr.length; i++){
           arr[i] = sc.nextInt();
       }
        int low =0;
        int high = arr.length-1;
        while(low <= high) {
            int mid = low + (high - low / 2);

            if (arr[mid] == x){
                System.out.println(mid);
            }
            if(arr[mid] < x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }


    }
}
