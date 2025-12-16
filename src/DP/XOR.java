package DP;

public class XOR {
    public static void main(String[] args) {
        int[] arr= {1,6,3};
        int k = 7;
        int n = arr.length;
        System.out.println(XOR_sum(arr,k,n));

    }
    static int XOR_sum(int arr[], int k, int n){

        int max = Integer.MIN_VALUE;
        for(int i=0; i<=k;i++){
            int res =0;
            for(int j=0; j<n; j++){
                res = res + (i^arr[j]);
                max = Math.max(res,max);
            }
        }
    return max;
    }
}
