import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        double compound = p* Math.pow((1+r/100), n);
        System.out.println(compound);
    }
}
