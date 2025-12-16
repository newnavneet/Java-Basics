package Array;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};
        maxSum(numbers);
    }
    public static void maxSum(int arr[]){
        int currsum=0;
        int max=Integer.MIN_VALUE;
        int total =0;
        for(int i=0; i< arr.length;i++){
            currsum =0;
            for(int j=i ; j < arr.length; j++){

                currsum+= arr[j];
                total+= currsum;
                System.out.println(currsum);

//                for (int k=i; k<=j; k++){
//                    //System.out.print(arr[k] + " ");
//                }
                if(max <  currsum){
                    max = currsum;
                }

            }

        }
        System.out.println(total);
        System.out.println(max);

    }
}
