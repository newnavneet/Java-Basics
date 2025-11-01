package Functions;

public class Largest {
    public static void main(String[] args) {
      int ans =  largest(22,45,56);
        System.out.println(ans);
      int ans2 = smallest(22,66,1);
        System.out.println(ans2);
    }
    static int largest(int a, int b, int c){
        int max = a;
        if(b>max){
            max=b;
        }
        if (c>max) {
            max = c ;
        }
      return max;

    }
    static  int smallest(int d,int e, int f){
        int min =d;
        if(e<min){
            min = e;
        }
        if(f<min){
            min = f;
        }
        return min;
    }
}
