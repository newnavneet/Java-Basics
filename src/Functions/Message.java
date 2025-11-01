package Functions;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
     // String inbox = greet();
      //  System.out.println(inbox);
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String personalised = mygreet(name);
        System.out.println(personalised);
    }

     static String mygreet(String name) {

         return "Hello "  + name;
    }

    static String greet(){
        String greeting = "How are you";
        return greeting;
    }
}
