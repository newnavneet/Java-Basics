package Patterns;

import java.util.Scanner;

public class Combine {
    public static void main(String[] args) {
        p2(5);
        p1(5);
    }
    static void p1(int n){

        for(int i= 0; i<n; i++){
            for(int j =0; j<i; j++){
                System.out.print(" ");
            }
            for(int j =0; j< 2*n -(2*i+1); j++){
                System.out.print("*");
            }
            for(int j =0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void p2(int n){
        for(int i= 0; i<n; i++){
            for(int j =0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j =0; j<2*i+1; j++){
                System.out.print("*");
            }
            for(int j =0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
