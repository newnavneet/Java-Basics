package Array;

public class Largest {
    public static void main(String[] args) {
        int[] arr = {12,55,66,777,88,999,888,1000};
        int largest = arr[0];
        for(int i=0; i< arr.length;i++){
           if(arr[i]>largest){
               largest = arr[i];

           }
        }
        System.out.println(largest);
    }
}
