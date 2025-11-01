package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
     fun("Ram", "Shyam", "Hari","Yash");

    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
