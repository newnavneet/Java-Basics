package Array;

import java.util.Arrays;

public class Multidimension {
    public static void main(String[] args) {
        int [][] nums = new int[3][];
        int[][] arr = {
                {1,2,5}, // 0th index
                {3,5,},//1st index
                {4,6,7,8}, // 2nd index
        };
        System.out.println(Arrays.toString(arr));
    }
}
