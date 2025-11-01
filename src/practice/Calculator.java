package practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b) {
                System.out.println("greater");
            } else if (a < b) {
                System.out.println("smaller");
            } else {
                System.out.println("equal");
            }

        }
    }
