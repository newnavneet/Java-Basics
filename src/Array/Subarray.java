package Array;

public class Subarray {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);


    }

    public static void printSubarrays(int arr[]){
        int total=0;

        int t=0;
        for(int i=0; i< arr.length;i++){
            int start = i;
            int currentsum =0;
            for(int j=i; j< arr.length; j++) {
                int end = j;
                currentsum+=arr[j];
                total+=currentsum ;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k] + " ");

                }
                t++;
                System.out.println();
            }

            System.out.println();
        }
        System.out.println( total + " is total sum of subarray");
        System.out.println("Total number of subarrays " + t);
    }
}
