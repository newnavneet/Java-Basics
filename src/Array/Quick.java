package Array;

public class Quick {
    public static void main(String[] args) {
        int A[] = {10,16,8,12,15,6,3,9,5,};
        QuickSort(A,0,A.length);

        for(int z: A){
            System.out.println(z + " ");
        }

    }

    public static void QuickSort(int A[],int l, int h){
        if(l<h){
            int j = Partition(A,l,h);
            QuickSort(A,l,j);
            QuickSort(A,j+1,h);
        }

    }
    public static int Partition(int A[],int l, int h){
        {
            int pivot=A[l];
            int i = l;
            int j = h;
            while (i < j) {
                do {
                    i++;
                }while ( i < h && A[i]<= pivot);
                do {
                    j--;
                } while (j>=l && A[j] > pivot);
                if(i <j){
                    swap(A,i,j);
                }
            }
            swap(A,l,j);
            return j;
        }

    }
    public static void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
