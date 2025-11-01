package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];
        int n = arr.length;
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();;
            System.out.println(Arrays.toString(arr));
        }

    }
}
