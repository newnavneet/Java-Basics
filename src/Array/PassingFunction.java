package Array;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
       int[] nums = {2,34,55,67,89};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
      arr[0] = 99;
    }
}
// arrays are immutable in java